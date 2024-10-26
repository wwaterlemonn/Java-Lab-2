package moveset;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect dodgeup = new Effect().stat(Stat.EVASION, 1).turns(-1);
        p.addEffect(dodgeup);
    }

    @Override
    protected String describe(){
        return "использует Double Team";
    }
}
