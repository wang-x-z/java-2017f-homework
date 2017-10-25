
public class Huluwa implements Creature, Comparable {

	private COLOR color;
	private SENIORITY seniority;
	private Position position;

	Huluwa(COLOR color, SENIORITY seiority) {
		this.color = color;
		this.seniority = seiority;
	}

	public COLOR getColor() {
		return color;
	}

	public SENIORITY getSeniority() {
		return seniority;
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public void setPosition(Position position) {
		this.position = position;
		position.setHolder(this);
	}
	
	@Override 
	public void clearPosition() {
		this.position.clearHolder();
		this.position = null;
	}
	
	@Override
	public void report() {
		System.out.print("@"+this.seniority.toString());
	}
	
    public boolean biggerThan(Comparable brother){

        if (brother instanceof  Huluwa)
            return this.getSeniority().ordinal()> ((Huluwa) brother).getSeniority().ordinal();
        else
            return false;
    }
}

enum COLOR {
	��, ��, ��, ��, ��, ��, ��
}

enum SENIORITY {
	�ϴ�, �϶�, ����, ����, ����, ����, ����
}