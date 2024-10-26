package moveset;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove{
    public Growth(){
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect atkup = new Effect().stat(Stat.ATTACK, 1).turns(-1);
        Effect spatkup = new Effect().stat(Stat.SPECIAL_ATTACK, 1).turns(-1);
        p.addEffect(atkup);
        p.addEffect(spatkup);
    }

    @Override
    protected String describe(){
        return "использует Growth";
    }
}
