package HuLu;
enum COLOR {
    ��, ��, ��, ��, ��, ��, ��
}

enum SENIORITY {
    һ, ��, ��, ��, ��, ��, ��
}
public class Huluwa extends Creature implements Comparable{
	private COLOR color;
    private SENIORITY seniority;
    //private Position position;
    //private String name;
	Huluwa(COLOR color, SENIORITY seiority) {
		super("��"+seiority.toString());
        this.color = color;
        this.seniority = seiority;
       // this.name="��"+seiority.toString();
    }
	
	public COLOR getColor() {
        return color;
    }

    public SENIORITY getSeniority() {
        return seniority;
    }
    
//	public String getName(){
//		return name;
//	}
//	
//	@Override
//    public Position getPosition() {
//        return position;
//    }
//
//    @Override
//    public void setPosition(Position position) {
//        this.position = position;
//        position.setHolder(this);
//    }

    @Override
    public void report() {
        System.out.print(this.seniority.toString() + "(" + this.color.toString() + ")");
    }
    
    @Override
    public boolean isBiggerThan(Comparable another){

        if (another instanceof  Huluwa)
            return this.getSeniority().ordinal()> ((Huluwa) another).getSeniority().ordinal();
        else
            return false;
    }
}
