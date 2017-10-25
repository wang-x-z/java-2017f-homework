enum Color{
    RED, ORANGE, YELLOW, GREEN, CYAN, BLUE, PURPLE;
}

enum Rank{
	ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN;
}

public class Huluwas implements Creature, Comparable{    //��«�޸�����
    private Color color;
    private Rank rank;
    private Position position;
    Huluwas(Rank r, Color c){
       rank = r;
       color = c;
   }
   
   public String Report_Color() {  //���Լ�����ɫ
	   String color_to_chinese = "��ɫ";
	   switch(color) {
	   case RED:
		   color_to_chinese = "��"; break;
	   case ORANGE:
		   color_to_chinese = "��"; break;
	   case YELLOW:
		   color_to_chinese = "��"; break;
	   case GREEN:
		   color_to_chinese = "��"; break;
	   case CYAN:
		   color_to_chinese = "��"; break;
	   case BLUE:
		   color_to_chinese = "��"; break;
	   case PURPLE:
		   color_to_chinese = "��"; break;
	   default:
		   break;
	   }
	   return color_to_chinese;
   }
   
   public String Report_Rank() {   //���Լ�������
	  String rank_to_chinese = "����";
	  switch(rank) {
	   case ONE:
		   rank_to_chinese = "����"; break;
	   case TWO:
		   rank_to_chinese = "����"; break;
	   case THREE:
		   rank_to_chinese = "����"; break;
	   case FOUR:
		   rank_to_chinese = "����"; break;
	   case FIVE:
		   rank_to_chinese = "����"; break;
	   case SIX:
		   rank_to_chinese = "����"; break;
	   case SEVEN:
		   rank_to_chinese = "����"; break;
	   default:
		   break;  
	  }
	  return rank_to_chinese;
   }
   
   public Color getColor() {
	   return color;
   }
   public Rank getRank() {
	   return rank;
   }
   
   public void report() {
	   System.out.print(Report_Rank()+Report_Color()+'\t');
   }
	public void setPosition(Position position) {
		this.position = position;
		position.setHolder(this);
		position.InPos();
	}
	public Position getPosition() {
		return this.position;
	}
	
	public boolean biggerThan(Comparable brother){
		if (brother instanceof  Huluwas)
            return this.getRank().ordinal()> ((Huluwas) brother).getRank().ordinal();
        else
            return false;
    }

}