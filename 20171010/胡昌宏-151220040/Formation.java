
public class Formation {
	private static final int N = 20;
	private Position [][]positions;
	public Formation() {
		positions = new Position[N][N];
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				positions[i][j] = new Position(i, j);
		}
	}
	
	public void Random_Queue_for_Huluwas(Creature []creature) {  //��«�������Ŷ�
		for(int i = 1; i < creature.length; i++) {
			creature[i].setPosition(positions[i-1][0]);
		}
		creature[0].setPosition(positions[creature.length-1][0]);
	}
	
	public void Cheering(Creature creature) {   //����������λ��
		creature.setPosition(positions[0][0]);
	}
	
	public void Snake_Queue(Creature []creature) { //����
		for(int i = 0; i < creature.length; i++) {
			creature[i].setPosition(positions[0+i][0]);
		}
	}
	
	public void Goose_Queue(Creature []creature) {  //����
		for(int i = 0; i < creature.length; i++) {
			creature[i].setPosition(positions[creature.length-1-i][i]);
		}
	}
	
	public void Crane_Queue(Creature []creature) {  //����
		int mid = (creature.length-1)/2;
		for(int i = 0; i < creature.length; i++) {
		if(i > mid)
				creature[i].setPosition(positions[creature.length-1-i][i]);
			else
				creature[i].setPosition(positions[i][i+0]);
		}
	}
	
	public void ChongE_Queue(Creature []creature) {  //����
		for(int i = 0; i < creature.length; i++) {
			if(i%2 == 0)
				creature[i].setPosition(positions[i][1]);
			else
				creature[i].setPosition(positions[i][0]);
		}
	}
}
