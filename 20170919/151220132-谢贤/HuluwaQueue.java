
public class HuluwaQueue {
	public static final int huluwaNum = 7; //��«������
	private HuLuWa []huluwa=new HuLuWa[huluwaNum];	//��«�����飬�������±��ʾ��«������λ��
	
	public void randomStand()
	{	 
		//���ɺ�«�޶��󲢡������վ��
		 System.out.println("---------\"���\"վ��---------");
		 huluwa[0]=new HuLuWa(3,HuLuWa.Color.yellow,"����������ͷ�ޣ��ȣ�ͭͷ���۵�ǹ����\n");
		 huluwa[1]=new HuLuWa(5,HuLuWa.Color.cyan,"�������޴���ޣ��ҵĶ�������ͧ\n");
		 huluwa[2]=new HuLuWa(6,HuLuWa.Color.blue,"�������������ޣ�����Ӱȥ����\n");
		 huluwa[3]=new HuLuWa(1,HuLuWa.Color.red,"���Ǵ��޴����ޣ��������������\n");
		 huluwa[4]=new HuLuWa(2,HuLuWa.Color.orange,"���Ƕ��޻����ޣ�����ǧ����˳���\n");
		 huluwa[5]=new HuLuWa(7,HuLuWa.Color.purple,"�������ޱ����ޣ�����һ������«�Ҵ���Ҳ����\n");
		 huluwa[6]=new HuLuWa(4,HuLuWa.Color.green,"���������һ��ޣ��뿴��������\n");
	}

	public void bubbleSort()
	{
		System.out.println("-------ð������-------");
		for(int i=0;i<huluwaNum-1;i++)
			for(int j=i+1;j<huluwaNum;j++)
				if(huluwa[i].getRank()>huluwa[j].getRank())
				{
					HuLuWa temp=huluwa[i];
					huluwa[i].howl(i+1,j+1);	//��λ��ʱ����
					huluwa[i]=huluwa[j];
					huluwa[i].howl(j+1,i+1);
					huluwa[j]=temp;				
				}
	}
	
	public void callOffByRank()
	{
		System.out.println("-------�����б���-------");
		for(int i=0;i<huluwaNum;i++)
			huluwa[i].callOffByRank();
	}
	
	public void callOffByColor()
	{
		System.out.println("-------����ɫ����-------");
		for(int i=0;i<huluwaNum;i++)
			huluwa[i].callOffByColor();
	}
	
	public void QuickSort()
	{
		System.out.println("-------��������-------");
		QuickSort(0,huluwaNum-1);
	}
	
	public int partition(HuLuWa pvoit,int first,int last)
	{
		int i=first+1,empty=first;	//pvoit��«��ԭ�����ڵ�λ����Ϊempty
		while(i<=last)
		{
			if(huluwa[i].getColor().ordinal()<pvoit.getColor().ordinal())//ͨ����«����ɫ��ö�������е��������бȽ�
			{//���ҵ�һ����pvoit��ɫ��С���ĺ�«�ޣ�������ŵ�empty��λ�ã�empty���ұ߽��ڵĺ�«����ȥ�������pvoit��ɫ��С���ĺ�«�޵�ԭ��λ�ã�Ȼ��empty����һλ
				if(empty!=i)
					huluwa[i].howl(i+1,empty+1);
				huluwa[empty]=huluwa[i];
				if(empty+1!=i)
					huluwa[empty+1].howl(empty+1+1,i+1);
				huluwa[i]=huluwa[empty+1];
			    empty+=1;         
			    
			}
			i+=1;
		}
		return empty;
	}
	
	public void QuickSort(int first,int last)
	{
		
		if(first>=last)
	          return;
		HuLuWa pvoit=huluwa[first];	
	    int splitPoint=partition(pvoit,first,last);	//�ҵ�pvoit��«��Ӧ�ڵ�λ��
	    if(splitPoint!=first)
	    	pvoit.howl(first+1, splitPoint+1);
	    huluwa[splitPoint]=pvoit;
	    QuickSort(first,splitPoint-1);	//��pvoit��«����ߵĺ�«�޽��еݹ�����
	    QuickSort(splitPoint+1,last);

	}
	
}
