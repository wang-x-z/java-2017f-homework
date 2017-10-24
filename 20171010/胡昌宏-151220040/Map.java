
public class Map {
	private static final int N = 20;
	public Position [][]positions;
	public Map() {
		positions = new Position[N][N];
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				positions[i][j] = new Position(i, j);
		}
	}
	public void putCreature(Creature creature, int x, int y) { //��һ����������ͼ��
		positions[creature.getPosition().getX()+x][creature.getPosition().getY()+y].setHolder(creature);
	}
	
	public void putCreatures(Creature []creature, int x, int y) {  //��һȺ��������ͼ��
		for(int i = 0; i < creature.length; i++) {
			putCreature(creature[i], x, y);
		}
	}
	
	public void outCreature(Creature creature, int x, int y) {  //һ������ӵ�ͼ�г�ȥ
		positions[creature.getPosition().getX()+x][creature.getPosition().getY()+y].setHolder(null);
		positions[creature.getPosition().getX()+x][creature.getPosition().getY()+y].OutPos();
	}
	
	public void outCreatures(Creature []creature, int x, int y) {  //һȺ����ӵ�ͼ�г�ȥ
		for(int i = 0; i < creature.length; i++)
			outCreature(creature[i], x, y);
	}
	
	public void ClearMap() {  //���������ͼ
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(positions[i][j].Is_empty() != true) {
					positions[i][j].setHolder(null);
					positions[i][j].OutPos();
				}
			}
		}
	}
	
	public void show() {  //��ӡ��ͼ
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				
				if(positions[i][j].Is_empty() != true)
					positions[i][j].getHolder().report();
				else
					System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}
