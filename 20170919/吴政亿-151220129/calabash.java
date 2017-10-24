enum  COLOR{
    Red,Orange,Yellow,Green,Cyan,Blue,Purple;
}

public class Calabash {
    private String name;
    private int index;
    private COLOR color;
    
    
    public Calabash(String name, int index, COLOR color){
        this.name = name;
        this.index = index;
        this.color = color;
    }
    
    public void SetCalabash(String name, int index, COLOR color) {
    	this.name = name;
        this.index = index;
        this.color = color;
    }
    
    public String GetName() {
    	return this.name;
    }
    
    public String GetColor() {
    	 String temp = null;
         switch(this.color){
             case Red:   temp = "��";break;
             case Orange:temp = "��";break;
             case Yellow:temp = "��";break;
             case Green: temp = "��";break;
             case Cyan:  temp = "��";break;
             case Blue:  temp = "��";break;
             case Purple:temp = "��";break;
         }
         return temp;
    }
    
    public int GetIndex() {
    	return this.index;
    }
}

