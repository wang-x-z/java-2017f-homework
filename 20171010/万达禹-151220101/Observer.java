package HuluTeam;

import java.util.Scanner;

public class Observer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleField f = new BattleField(18);
		HuluBrothers a = new HuluBrothers();
		a.add("��");
		a.add("��");
		a.add("��");
		a.add("��");
		a.add("��");
		a.add("��");
		a.add("��");
		Enemies b = new Enemies();
		b.add("Ы");
		f.addHuluBrothers(a);
		f.addEnemies(b);
		Scanner in = new Scanner(System.in);
		String ch;
		do{
			f.Choose_A_Formation_For_Enemies(9, 11);
			ch = in.next();
		}while(!ch.equals("exit"));
		in.close();
	}

}
