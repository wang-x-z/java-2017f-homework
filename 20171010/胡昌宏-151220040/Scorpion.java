
public class Scorpion implements Creature{ 
	private Position position;
	
	 public void report() {
		   System.out.print("Ы�Ӿ�"+'\t');
	   }
		public void setPosition(Position position) {
			this.position = position;
			position.setHolder(this);
			position.InPos();
		}
		public Position getPosition() {
			return this.position;
		}
}