package moveset;

import ru.ifmo.se.pokemon.*;

public class DragonBreath extends SpecialMove{
    public DragonBreath(){
        super(Type.DRAGON, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() < 0.3){
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe(){
        return "использует Dragon Breath";
    }
}
