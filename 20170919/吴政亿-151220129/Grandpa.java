public class Grandpa {
	public Queue calabashes = new Queue();
	public Grandpa() {
		calabashes.EnQueue(new Calabash("�ϴ�", 1, COLOR.Red));
	    calabashes.EnQueue(new Calabash("�϶�", 2, COLOR.Orange));
	    calabashes.EnQueue(new Calabash("����", 3, COLOR.Yellow));
	    calabashes.EnQueue(new Calabash("����", 4, COLOR.Green));
	    calabashes.EnQueue(new Calabash("����", 5, COLOR.Cyan));
	    calabashes.EnQueue(new Calabash("����", 6, COLOR.Blue));
	    calabashes.EnQueue(new Calabash("����", 7, COLOR.Purple));
	}
	
	//ð������
    public void bubbleSort() {
        for (int i = 0; i < calabashes.Size(); i++) {
            for (int j = 0; j < calabashes.Size() - 1 - i; j++) {
                if ((calabashes.GetCalabash(j).GetIndex()) > (calabashes.GetCalabash(j + 1).GetIndex())) {
                    calabashes.swap(j, j+1);
                }
            }
        }
    }
    
  //��������
    public void quickSort(int start, int end){
    	int i = start,j = end;
    	while(i<j) {
    		while(j>i && calabashes.GetCalabash(j).GetIndex() >= calabashes.GetCalabash(i).GetIndex())
    			j--;
    		if(i<j) {
    			calabashes.swap(i, j);
    			i++;
    		}
    		while(i<j && calabashes.GetCalabash(i).GetIndex() <= calabashes.GetCalabash(j).GetIndex()) 
    			i++;
    		if(i<j) {
    			calabashes.swap(i, j);
    			j--;
    		}
    	}
    	 if(start<i-1)
    		 quickSort(start, i-1);
    	 if(i+1<end)
    		 quickSort(i+1, end);
    }
	
    public static void main(String[] args) {
    	//��ʼ��һ��үү
    	Grandpa grandpa = new Grandpa();
    	//үүŪ������
    	grandpa.calabashes.shuffle();
    	//үүð�������«��
    	grandpa.bubbleSort();
    	//��«�ޱ�����
    	grandpa.calabashes.ReportName();
    	//үүŪ������
    	grandpa.calabashes.shuffle();
    	//үү���������«��
    	grandpa.quickSort(0, grandpa.calabashes.Size()-1);
    	//��«�ޱ���ɫ
    	grandpa.calabashes.ReportColor();

    	
    }
}

