public class LineFormatter implements Formatter, Constants {
    @Override
    public void format(Space space) {
        System.out.println("雁行阵：");

        Creature creatures[][] = space.getCreatures();
        Position positions[][] = space.getPositions();

        for (int m = HALFSPACE; m < MAXSPACE; m++) {
            for (int n = 0; n < MAXSPACE; n++) {
                positions[m][n].clearOccupy();
            }
        }

        //蝎子精位置
        positions[10][8].setHolder(creatures[3][0]);
        positions[10][8].setOccupy();
        creatures[3][0].setPos(positions[10][8]);

        //喽啰位置
        int k = 0;
        for (int i = 11, j = 7; i < 19; i++, j--, k++) {
            positions[i][j].setHolder(creatures[4][k]);
            positions[i][j].setOccupy();
            creatures[4][k].setPos(positions[i][j]);
        }
    }
}
