
public class Main {
	public static void main(String args[]){
		/*����7����«��*/
		Creature [] Hulubros = new Huluwas[7];
		for (int i = 0; i < Hulubros.length; i++)
			Hulubros[i] = new Huluwas(Rank.values()[i],Color.values()[i]);
		
		/*����һȺСආ���Ϊ�׵�ΪЫ�Ӿ�*/
		Creature []monsters = new Creature[7];
		monsters[0] = new Scorpion();
		for(int i = 1; i < monsters.length; i++)
			monsters[i] = new Goblin();
		
		/*����үү���߾�*/
		Creature grandpa = new Grandpa();
		Creature snake = new Snake();
		
		/*����*/
		Formation formation = new Formation();
		formation.Random_Queue_for_Huluwas(Hulubros);//��«���Գ���������վ��
		formation.Goose_Queue(monsters);  //Сආ�����������
		formation.Cheering(grandpa);  //����������үү
		formation.Cheering(snake);  //�����������߾�
		
		/*�����������źõ����ͷ����ͼ��*/
		Map map = new Map();
		map.putCreatures(Hulubros, 5, 3);
		Sorter bq = new BubbleSort();
		bq.sort(map, Hulubros, 5, 3);  //�˴���«��Ҫ������
		map.putCreatures(monsters, 5, 5);
		map.putCreature(grandpa, 8, 2);
		map.putCreature(snake, 6, 8);
		map.show();  //��ӡ��ͼ
		map.outCreatures(monsters, 5, 5);  //Сආ��ӵ�ͼ�г�ȥ
		
		/*�˴�Сආ����������ӡ*/
		formation.Crane_Queue(monsters); //Сආ�����������
		map.putCreatures(monsters, 7, 5);
		map.show();
		map.outCreatures(monsters, 7, 5);
		
		/*�˴�Сආ����������ӡ*/
		formation.ChongE_Queue(monsters);  //Сආ�����������
		map.putCreatures(monsters, 5, 6);
		map.show();
		map.ClearMap();
		
		return;
	}
}
