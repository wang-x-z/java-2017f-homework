
public class Huluwa {
	Rank rank;
	Color color;
	
	public Huluwa(Rank r, Color c) {
		this.rank = r;
		this.color = c;
	}
	
	public boolean greaterRank(Huluwa h) {
		return Rank.greater(this.rank, h.rank);
	}
	
	public boolean greaterColor(Huluwa h) {
		return Color.greater(this.color, h.color);
	}
	
	public Rank getRank() {
		return rank;
	}
	public String getStrRank() {
		return "��" + rank.name;
	}
	public Color getColor() {
		return color;
	}
	public String getStrColor() {
		return color.name;
	}
}

enum Rank{
	/* Huluwa's Rank */
	FIRST("��"),
	SECOND("��"),
	THIRD("��"),
	FOURTH("��"),
	FIFTH("��"),
	SIXTH("��"),
	SEVENTH("��");
	
	String name;
	Rank(String name) {this.name = name;}
	public static boolean greater(Rank r1, Rank r2) {
		return r1.ordinal() < r2.ordinal();
	}
}


enum Color{
	/* Huluwa's Color */
	RED("��"),
	ORANCE("��"),
	YELLOW("��"),
	GREEN("��"),
	CYAN("��"),
	BLUE("��"),
	PURPLE("��");

	String name;
	Color(String name) {this.name = name;}
	public static boolean greater(Color c1, Color c2) {
		return c1.ordinal() < c2.ordinal();
	}
}