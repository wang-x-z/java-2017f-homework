package Huluwa;

public class Luoluo implements Creature {
	private Position num;
	Luoluo(Position pos)
	{
		num=pos;
	}
	public void setPosition(Position a)
	{
		this.num=a;
	
	}
	public void getsign()
	{
		System.out.print('��');
	}
	public Position getPosition()
	{
		
		return num;
	}
	
	public void tellname()
	{
		System.out.print("С����");
	}
	public void tellpos()
	{
		num.tellx();
		num.telly();
	}
}
