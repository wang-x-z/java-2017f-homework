package huluwa;
public class Huluxiongdi {
	final int COUNT=7;
	int color;
	int name;
	int seat;
	public Huluxiongdi(int colors,int names,int seats)
	{
		color=colors;
		name=names;
		seat=seats;
	}
	public int getcount(){
		return COUNT;
	}
	public void change_sit(int i,int j)
	{
		String name=getname();
		System.out.println(name+":"+i+"->"+j);		
			
	}
	public String getcolor()
	{
		String ans;
		 switch(color){
  
         case 1:
             ans="��ɫ";
             break;
         case 2:
        	 ans="��ɫ";
             break;
         case 3:
        	 ans="��ɫ";
             break;
         case 4:
        	 ans="��ɫ";
             break;
         case 5:
        	 ans="��ɫ";
             break;
         case 6:
        	 ans="��ɫ";
             break;
         case 7:
        	 ans="��ɫ";
             break;
         default:
        	 ans="û�������ɫ";
             break;
        }
		 return ans;
	}
	public String getname()
	{
		String ans;
		 switch(this.name){
       
         case 1:
        	 ans="�ϴ�";
             break;
         case 2:
        	 ans="�϶�";
             break;
         case 3:
        	 ans="����";
             break;
         case 4:
        	 ans="����";
             break;
         case 5:
        	 ans="����";
             break;
         case 6:
        	 ans="����";
             break;
         case 7:
        	 ans="����";
             break;
           default:
        	 ans="û�������«��";
             break;
        }
		 return ans;
	}
}
