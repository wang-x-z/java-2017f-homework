package javaH2;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HuluM God=new HuluM();
		God.add(new Huluwa("�ϴ�","��"));
		God.add(new Huluwa("�϶�","��"));
		God.add(new Huluwa("����","��"));
		God.add(new Huluwa("����","��"));
		God.add(new Huluwa("����","��"));
		God.add(new Huluwa("����","��"));
		God.add(new Huluwa("����","��"));
		
		
		System.out.println("�ȿ��³�ʼ�����");
		God.Show();
		
		System.out.println("�����ˣ���������λ�÷�������Щ�仯��");
		God.assemble();
		System.out.println("������ϣ�����������ôվ�ӵģ�");
		God.Show();
		
		System.out.println("ð������󣬶��з����ı仯��");
		God.BubbleSort();
		System.out.println("������ϣ�����������ôվ�ӵģ�");
		God.Show();
		
		//��ɢ
		
		System.out.println("�����ˣ���������λ�÷�������Щ�仯��");
		God.assemble();
		System.out.println("������ϣ�����������ôվ�ӵģ�");
		God.Show();
		
		
		System.out.println("���ַ�����󣬶��з����ı仯��");
		God.BinarySort();
		System.out.println("������ϣ�����������ôվ�ӵģ�");
		God.Show();

		
	}

}

