package Huluwa;

public class Huluwa implements Compare,Creature{
	/*public enum EnumTest {
    FRANK("The given name of me"),
    LIU("The family name of me");
    private String context;
    private String getContext(){
   	 return this.context;
    }
    private EnumTest(String context){
   	 this.context = context;
    }
    public static void main(String[] args){
   	 for(EnumTest name :EnumTest.values()){
   		 System.out.println(name+" : "+name.getContext());
   	 }
   	 System.out.println(EnumTest.FRANK.getDeclaringClass());
    }
}} */
	private Identity id;
	private Position num;
	Huluwa(Identity id)
	{
			this.id=id;
	}
	public void setPosition(Position a)
	{
		this.num=a;
	
	}
	public void getsign()
	{
		System.out.print(id);
	}
	public Identity getid()
	{
		return id;
		
	}
	public Position getPosition()
	{
		
		return num;
	}
	public void tellcolor()
	{
		System.out.print(id+" ");
	}
	public void tellname()
	{
		System.out.print(id.context+" ");
	}
	public void tellpos()
	{
		num.tellx();
	}
	@Override
	public boolean bigger(Compare other)//����ʵ����compare�ӿڵ��������Ϊ�����Ĳ������ݽ���
	{
		 if (other instanceof  Huluwa)//instanceof�ж��Ƿ��Ǻ�«���࣬����ֵΪtrue or false
	            return this.id.senior>((Huluwa) other).id.senior;
	        else
	            return false;
	}
	
	public static void main(String[] args){
   	 //for(identity name :identity.values()){
		Huluwa brothers[]=new Huluwa[7];
		 for (int i = 0; i < brothers.length; i++)
		 {
	            brothers[i] = new Huluwa(Identity.values()[i]);
	     }
		 Quene q=new Quene(brothers);
		 q.zhenxing();
		 System.out.println("�任���ͣ�");
		 q.reset();
		 q.zhenxing();
		 
		 
	}
}

enum Identity
{
		��("�ϴ�",1),
		��("�϶�",2),
		��("����",3),
		��("����",4),		
		��("����",5),
		��("����",6),
		��("����",7);
	  public String context;
	  public int senior;
	  private Identity(String context,int x)
	  {
	    	 this.context = context;
	    	 this.senior=x;
	   }
	  
}