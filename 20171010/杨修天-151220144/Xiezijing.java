package Huluwa;

public class Xiezijing implements Creature {
	private Position num;
	Xiezijing(Position pos)
	{
		num=pos;
	}
	public void setPosition(Position a)
	{
		this.num=a;
	
	}
	public void getsign()
	{
		System.out.print('Ы');
	}
	public Position getPosition()
	{
		
		return num;
	}
	
	public void tellname()
	{
		System.out.print("������");
	}
	public void tellpos()
	{
		num.tellx();
		num.telly();
	}
}