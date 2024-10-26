package moveset;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove{
    public Overheat(){
        super(Type.FIRE, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect spatkdown = new Effect().stat(Stat.SPECIAL_ATTACK, -2).turns(-1);
        p.addEffect(spatkdown);
    }

    @Override
    protected String describe(){
        return "использует Overheat";
    }
}
