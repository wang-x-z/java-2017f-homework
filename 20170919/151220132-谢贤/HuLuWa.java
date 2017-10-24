
public class HuLuWa {
	private int rank;	//��«������
	private String name;
	private Color color;
	
	public enum Color{
		red, orange, yellow, green, cyan, blue, purple
	}
	
	public HuLuWa(int rank,Color color,String debutWork) //���캯��
	{
		this.rank=rank;
		this.color=color;
		System.out.println(debutWork);
	}
	
	
	public void howl(int srcPosition,int desPosition)	//�ı�λ��ʱ����
	{
		this.callOffByRank();		
		System.out.println(srcPosition+"->"+desPosition);
	}
	
	public void callOffByRank()
	{
		switch(this.rank)
		{
		case 1:System.out.println("�ϴ�");break;
		case 2:System.out.println("�϶�");break;
		case 3:System.out.println("����");break;
		case 4:System.out.println("����");break;
		case 5:System.out.println("����");break;
		case 6:System.out.println("����");break;
		case 7:System.out.println("����");break;
		default:break;
		}
	}

	public void callOffByColor()
	{
		switch(this.color.ordinal()+1)
		{
		case 1:System.out.println("��ɫ");break;
		case 2:System.out.println("��ɫ");break;
		case 3:System.out.println("��ɫ");break;
		case 4:System.out.println("��ɫ");break;
		case 5:System.out.println("��ɫ");break;
		case 6:System.out.println("��ɫ");break;
		case 7:System.out.println("��ɫ");break;
		default:break;
		}
		
	}

	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
}

