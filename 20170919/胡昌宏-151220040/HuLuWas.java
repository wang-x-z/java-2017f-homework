enum Color{
    RED, ORANGE, YELLOW, GREEN, CYAN, BLUE, PURPLE;
}

public class HuLuWas {    //��«�޸�����
	int rank;
    Color color;
   
   HuLuWas(int r, Color c){
       rank = r;
       color = c;
   }
   
   public String Report_Color() {  //���Լ�����ɫ
	   String color_to_chinese = "��ɫ";
	   switch(color) {
	   case RED:
		   color_to_chinese = "��"; break;
	   case ORANGE:
		   color_to_chinese = "��"; break;
	   case YELLOW:
		   color_to_chinese = "��"; break;
	   case GREEN:
		   color_to_chinese = "��"; break;
	   case CYAN:
		   color_to_chinese = "��"; break;
	   case BLUE:
		   color_to_chinese = "��"; break;
	   case PURPLE:
		   color_to_chinese = "��"; break;
	   default:
		   break;
	   }
	   return color_to_chinese;
   }
   
   public String Report_Rank() {   //���Լ�������
	  String rank_to_chinese = "����";
	  switch(rank) {
	   case 1:
		   rank_to_chinese = "�ϴ�"; break;
	   case 2:
		   rank_to_chinese = "�϶�"; break;
	   case 3:
		   rank_to_chinese = "����"; break;
	   case 4:
		   rank_to_chinese = "����"; break;
	   case 5:
		   rank_to_chinese = "����"; break;
	   case 6:
		   rank_to_chinese = "����"; break;
	   case 7:
		   rank_to_chinese = "����"; break;
	   default:
		   break;  
	  }
	  return rank_to_chinese;
   }
}
