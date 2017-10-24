
public class Embattle {
	public void embattle(Creature[] creatures, FORMATION formation, Point leaderpoint, DIRECTION direction) {
		switch (formation) {
		case ����:
			Changshe(creatures, leaderpoint, direction);
			break;
		case ����:
			Heyi(creatures, leaderpoint, direction);
			break;
		case ����:
			Henge(creatures, leaderpoint, direction);
			break;
		default:
			break;
		}
	}

	private void Changshe(Creature[] creatures, Point leaderpoint, DIRECTION direction) {

		creatures[0].setPosition(new Position());
		creatures[0].getPosition().setPoint(leaderpoint);
		for (int i = 1; i < creatures.length; i++) {
			int x = 0, y = 0;
			switch (direction) {
			case ��:
				x = leaderpoint.getX();
				y = leaderpoint.getY() - i;
				break;
			case ��:
				x = leaderpoint.getX();
				y = leaderpoint.getY() + i;
				break;
			case ��:
				x = leaderpoint.getX() - i;
				y = leaderpoint.getY();
				break;
			case ��:
				x = leaderpoint.getX() + i;
				y = leaderpoint.getY();
				break;
			default:
				break;
			}
			creatures[i].setPosition(new Position());
			creatures[i].getPosition().setPoint(new Point(x,y));
		}
	}

	private void Heyi(Creature[] creatures, Point leaderpoint, DIRECTION direction) {
		creatures[0].setPosition(new Position());
		creatures[0].getPosition().setPoint(leaderpoint);
		for (int i = 1; i < creatures.length; i++) {
			int x = 0, y = 0;
			int a = (i + 1) / 2;
			int b = (int) Math.pow(-1, i);
			switch (direction) {
			case ��:
				x = leaderpoint.getX() + a * b;
				y = leaderpoint.getY() - a;
				break;
			case ��:
				x = leaderpoint.getX() + a * b;
				y = leaderpoint.getY() + a;
				break;
			case ��:
				x = leaderpoint.getX() - a;
				y = leaderpoint.getY() + a * b;
				break;
			case ��:
				x = leaderpoint.getX() + a;
				y = leaderpoint.getY() + a * b;
				break;
			default:
				break;
			}
			creatures[i].setPosition(new Position());
			creatures[i].getPosition().setPoint(new Point(x,y));
		}
	}
	private void Henge(Creature[] creatures, Point leaderpoint, DIRECTION direction) {
		creatures[0].setPosition(new Position());
		creatures[0].getPosition().setPoint(leaderpoint);
		for (int i = 1; i < creatures.length; i++) {
			int x = 0, y = 0;
			switch (direction) {
			case ��:
				x = leaderpoint.getX() + (i % 2)*2;
				y = leaderpoint.getY() - i;
				break;
			case ��:
				x = leaderpoint.getX() + (i % 2)*2;
				y = leaderpoint.getY() + i;
				break;
			case ��:
				x = leaderpoint.getX() - i;
				y = leaderpoint.getY() + (i % 2)*2;
				break;
			case ��:
				x = leaderpoint.getX() + i;
				y = leaderpoint.getY() + (i % 2)*2;
				break;
			default:
				break;
			}
			creatures[i].setPosition(new Position());
			creatures[i].getPosition().setPoint(new Point(x,y));
		}
	}
}

enum FORMATION {
	����, ����, ����, ����, ����, ��Բ, ����, ��ʸ
}

enum DIRECTION {
	��, ��, ��, ��
}