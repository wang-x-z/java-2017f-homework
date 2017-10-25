package HuLu;


public class HuLuWa implements Creature, Comparable{

    private COLOR color;
    private RANK rank;
    private Position position;

    public COLOR getColor() {
        return color;
    }

    public RANK getRank() {
        return rank;
    }


    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
        position.setHolder(this);
    }

    HuLuWa(COLOR color, RANK rank) {
        this.color = color;
        this.rank = rank;
    }

    @Override
    public void show() {
        System.out.print(String.format("%-30s",this.toString()));
    }

   
    @Override
    public boolean isBiggerThan(Comparable brother){
    
            return this.getRank().ordinal()> ((HuLuWa) brother).getRank() .ordinal();
       
    }

    
    @Override
    public String toString(){
    	  return "#" + "("+this.position.getX()+","+this.position.getY()+")"+this.rank.toString()+"��" ;
    }
}


enum RANK {
    ��, ��, ��, ��, ��, ��, ��
}

enum COLOR {
    ��, ��, ��, ��, ��, ��, ��
}

