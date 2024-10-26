package moveset;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe(){
        return "использует Facade";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect atkup = new Effect().stat(Stat.ATTACK, 2).turns(0);
        /*по факту должен менять pow на 140, но это сделать нельзя, поэтому даю модификатор,
        который удваивает pow, но только если изначально модификатор 0*/
        Status status = p.getCondition();
        if (status == Status.BURN | status == Status.POISON | status == Status.PARALYZE){
            p.addEffect(atkup);
        }
    }
}
