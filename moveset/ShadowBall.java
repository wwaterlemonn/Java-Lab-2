package moveset;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove{
    public ShadowBall(){
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect spdefdown = new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.2).turns(0);
        p.addEffect(spdefdown);
    }

    @Override
    protected String describe(){
        return "использует Shadow Ball";
    }
}
