package HuLu;

public class Test {
 
    public static void main(String[] args) {
      
        Space space=new Space(16);
   
        Creature[] hulu = new Creature[7];
        for (int i = 0; i < hulu.length; i++) {
            hulu[i] = new HuLuWa(COLOR.values()[i], RANK.values()[i]);
        }
        
        Creature[] monster=new Creature[7];
        for(int i=1;i<7;i++){
            monster[i]=new Xiaolouluo();
        }
        monster[0]=new Xiezijing();
        
        Creature grandpa=new Grandpa();

        Creature shejing=new Shejing();

        Queue queue = new Queue(hulu);
        queue.messUp();
//        System.out.println("����ǰ��«�޵�˳��");
//        queue.queueShow();

        new BubbleSorter().sort(queue);
//        System.out.println("������«�޵�˳��");
//        queue.queueShow();
        
        System.out.println("ս����ʼ...\n\n");
        
        new ZhenChangshe().arrange(space, 8, 1, hulu);
        new ZhenYanhang().arrange(space, 6, 1, monster);
      
        space.setCreature(grandpa,8,2);
        space.setCreature(shejing,6,2);

        System.out.println("��һ�غϣ�������");
        space.spaceShow();
        
        space.cleanSpace();

        new ZhenChangshe().arrange(space, 7, 3, hulu);
        new ZhenHeyi().arrange(space, 4, 3, monster);
       
        space.setCreature(grandpa,7,4);
        space.setCreature(shejing,4,4);

        System.out.println("�ڶ��غϣ�������");
        space.spaceShow();
        
       
    }
}