package Xzr.Position;

import Xzr.Creature.Creature;

// 坑位，每个坑位存有位置信息，放置一个生物
public class Pit {
    private Position position;
    private Creature holder;

    public Pit(Position position){
        super();
        this.holder = null;
        this.position = position;
    }

    public Position getPosition(){
        return position;
    }

    public Creature getHolder(){
        return this.holder;
    }
    public void setHolder(Creature holder){
        if(holder == null){
            this.holder = null;
            return;
        }
        this.holder = holder;
        holder.setPosition(position);
    }

    public void clearHolder(){
        if(holder == null)
            return;
        holder = null;
        return;
    }
}
