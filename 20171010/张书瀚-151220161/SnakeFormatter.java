
public class SnakeFormatter implements Formatter, Constants {
    @Override
    public void format(Space space) {
        //System.out.println("长蛇阵：");

        Creature creatures[][] = space.getCreatures();
        Position positions[][] = space.getPositions();

        for (int m = 0; m < MAXSPACE; m++)
            for (int n = 0; n < HALFSPACE; n++)
                positions[m][n].clearOccupy();

        //葫芦娃位置
        for (int i = 1, j = 0; i < 8; i++, j++) {
            positions[4][i].setHolder(creatures[1][j]);
            positions[4][i].setOccupy();
            creatures[1][j].setPos(positions[4][i]);
        }
    }
}
