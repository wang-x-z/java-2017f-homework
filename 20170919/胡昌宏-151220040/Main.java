
public class Main {
	public static void main(String args[]){
       HuLuHole HuLu = new HuLuHole();
       System.out.println("�����Ŷӣ�");
       HuLu.Random_Func();
       HuLu.Report_all_Rank();
       System.out.println("ð��������̣�");
       HuLu.BubbleSort();
       System.out.println();
       System.out.println("ð����������");
       HuLu.Report_all_Rank();
       
       System.out.println("�����Ŷӣ�");
       HuLu.Random_Func();
       HuLu.Report_all_Color();
       System.out.println("����������̣�");
       HuLu.QSort(0, 6);
       System.out.println();
       System.out.println("������������");
       HuLu.Report_all_Color();
       return;
	}
}
 	
 	
