
public class Position {// ÿ������ռ��һ��λ��
	/*
	 * point ��λ���ڶ�ά�ռ������ 
	 * holder ռ�ݸ�λ�õ�����
	 */

	private Point point;
	private Creature holder;

	public Creature getHolder() {
		return holder;
	}

	public void setHolder(Creature holder) {
		this.holder = holder;
	}

	public void clearHolder() {
		this.holder = null;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
}
