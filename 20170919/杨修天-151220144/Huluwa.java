package Huluwa;

public class Huluwa implements Compare{
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
	private identity id;
	private Position num;
	Huluwa(identity id)
	{
			this.id=id;
	}
	public void setPosition(Position a)
	{
		this.num=a;
	
	}
	public identity getid()
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
	public boolean bigger(Compare other)//����ʵ����Compare�ӿڵ��������Ϊ�����Ĳ������ݽ���
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
	            brothers[i] = new Huluwa(identity.values()[i]);
	     }
		 Quene q=new Quene(brothers);
		 q.baoshu();
		 System.out.println();
		 
		 System.out.println("���ң�����");
		 q.shuffle();
		 q.baoshu();
		 System.out.println();
		 
		 System.out.println("��һ�����򣬱���");
		 Sorter s=new Bubblesort();
		 s.sort(q);
		 q.baoshu();
		 System.out.println();
		 
		 System.out.println("���ң�����");
		 q.shuffle();
		 q.baocolor();
		 System.out.println();
		 
		 System.out.println("�������������򣬱���");
		 s=new Insertsort();
		 s.sort(q);
		 q.baocolor();
		 System.out.println();
		 
	}
}

enum identity
{
		��ɫ("�ϴ�",1),
		��ɫ("�϶�",2),
		��ɫ("����",3),
		��ɫ("����",4),		
		��ɫ("����",5),
		��ɫ("����",6),
		��ɫ("����",7);
	  public String context;
	  public int senior;
	  private identity(String context,int x)
	  {
	    	 this.context = context;
	    	 this.senior=x;
	   }
	  
}