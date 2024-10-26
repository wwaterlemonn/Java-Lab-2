package moveset;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove{
    public Bulldoze(){
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect slow = new Effect().stat(Stat.SPEED, -1).turns(-1);
        p.addEffect(slow);
    }

    @Override
    protected String describe(){
        return "использует Bulldoze";
    }
}
