
public class Space {
	private static final int N = 20;
	private Position[][] battleground;

	public Space() {
		battleground = new Position[N][N];
	}
	
	/*	
	 * creatures ��Ҫ�ų����ε�����
	 * leaderpoint ��ͷ�ߵ�����
	 * formation ��Ҫ�ųɵ�����
	 * direction ���γ���
	 */
	public void embattle(Queue queue, Point leaderpoint, FORMATION formation, DIRECTION direction) {
		new Embattle().embattle(queue.getCreatures(), formation, leaderpoint, direction);
		for (Creature creature : queue.getCreatures()) {
			setCreature(creature);
		}
	}

	public void setCreature(Creature creature) {
		int x = creature.getPosition().getPoint().getX();
		int y = creature.getPosition().getPoint().getY();
		Point point = creature.getPosition().getPoint();
		if (isOccupied(x, y)) {
			System.out.println("��λ���ѱ�ռ�ã�");
			return;
		}
		battleground[x][y] = new Position();
		battleground[x][y].setPoint(point);
		battleground[x][y].setHolder(creature);
	}

	public void clearQueue(Queue queue) {
		for (Creature creature : queue.getCreatures()) {
			clearOneCreatrue(creature);
		}
	}
	
	public void clearOneCreatrue(Creature creature) {
		int x = creature.getPosition().getPoint().getX();
		int y = creature.getPosition().getPoint().getY();
		if (!isOccupied(x, y)) {
			System.out.println("ɾ������");
			return;
		}
		battleground[x][y].clearHolder(); // clear����Ӧ����set������Ӧ
		battleground[x][y] = null;
	}

	public Boolean isOccupied(int x, int y) {
		return battleground[x][y] != null;
	}

	public void drawBattleground() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (battleground[i][j] == null)
					System.out.print("  ");
				else
					battleground[i][j].getHolder().report();
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Huluwa[] brothers = new Huluwa[7];
		for (int i = 0; i < brothers.length; i++) {
			brothers[i] = new Huluwa(COLOR.values()[i], SENIORITY.values()[i]);
		}
		Creature[] demons = new Creature[7];
		demons[0] = new Scorpion();
		for (int i = 1; i < demons.length; i++) {
			demons[i] = new Minion();
		}
		Creature grandpa = new Grandfather();
		Creature snake = new Snake();

		Queue BrosQueue = new Queue(brothers);
		Queue DemonsQueue = new Queue(demons);
		Space space = new Space();
		//step1:��ʼ������߸��ֵܰ�(�ϴ������ߣ�վ��
		BrosQueue.shuffle();
		new BubbleSort().sort(BrosQueue);
		
		//step2:����«�ֵܵĳ�����Ӫ��Ы�Ӿ�Сආ���Ӫ�����ڶ�λ�ռ���
		Point leaderPoint = new Point(8, 9);
		space.embattle(BrosQueue, leaderPoint, FORMATION.����, DIRECTION.��);
		leaderPoint.setPoint(11, 9);
		space.embattle(DemonsQueue, leaderPoint, FORMATION.����, DIRECTION.��);

		//step3:����үү���߾������ڿռ��У�Ϊ����һ������������
		snake.setPosition(new Position());
		snake.getPosition().setPoint(new Point(19,9));
		space.setCreature(snake);
		grandpa.setPosition(new Position());
		grandpa.getPosition().setPoint(new Point(0,9));
		space.setCreature(grandpa);
		
		//step4:�����ž����ӡ���
		System.out.println("---------��«��(����) VS Ы�Ӿ�(����)---------");
		space.drawBattleground();

		//step5:Ы�Ӿ�Сආ���Ӫ�任�ɡ��������
		space.clearQueue(DemonsQueue);
		space.embattle(DemonsQueue, leaderPoint, FORMATION.����, DIRECTION.��);
		System.out.println("---------��«��(����) VS Ы�Ӿ�(����)---------");
		space.drawBattleground();
	}
}
