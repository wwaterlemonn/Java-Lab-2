package moveset;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide(){
        super();
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect spatkdown = new Effect().stat(Stat.SPECIAL_ATTACK, -1).turns(-1);
        p.addEffect(spatkdown);
    }

    @Override
    protected String describe(){
        return "использует Confide";
    }
}