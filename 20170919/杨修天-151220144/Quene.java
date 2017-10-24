package Huluwa;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Quene {
	private Position[] duilie;
	private Huluwa[] brothers;
	Quene(Huluwa[]brothers)
	{
		this.duilie=new Position [brothers.length];
		this.brothers=brothers;
		for(int i=0;i<brothers.length;i++)
			{this.duilie[i]=new Position(i);
			 this.duilie[i].setpeople(brothers[i]);
			}
	}
	public void shuffle() {
        Random rnd = ThreadLocalRandom.current();
        for (int i = brothers.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Position pos=brothers[i].getPosition();
            brothers[index].getPosition().setpeople(brothers[i]);
            pos.setpeople(brothers[index]);
               
        }
    }
	public Position[]getpositios()//��ǰ���д����к�«��վλ��Ϣ�����������ͨ���˷�����ȡ
	{
		return duilie;
	}
	public void baoshu()//��ӡ��ǰ���д����к�«��վλ��Ϣ
	{
		for(Position a:this.duilie)
			{//a.reportnum();
			 a.reportpeo();
			 
			}
		System.out.println();
	}
	
	public void baocolor()//��ӡ��ǰ���д����к�«��վλ��Ϣ
	{
		for(Position a:this.duilie)
			{//a.reportnum();
			 a.reportcolor();
			 
			}
		System.out.println();
	}
}
