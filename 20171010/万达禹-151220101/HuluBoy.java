package HuluTeam;

public class HuluBoy extends Creature{
	
	private int rank;
	
	public HuluBoy(String n){
		super(n);
		switch(n) {
			case "��":rank = 1;break;
			case "��":rank = 2;break;
			case "��":rank = 3;break;
			case "��":rank = 4;break;
			case "��":rank = 5;break;
			case "��":rank = 6;break;
			case "��":rank = 7;break;
			default: rank = -1;break;
		}
	}
	
	public int get_rank() {
		return this.rank;
	}	
	
	public void SetPosition(int x, int y) {
		super.setPosition(x, y);
		position.SetHolder(this);
	}
	
}