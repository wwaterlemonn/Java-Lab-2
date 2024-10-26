package moveset;

import ru.ifmo.se.pokemon.*;

public class FaintAttack extends PhysicalMove{
    public FaintAttack(){
        super(Type.DARK, 60, 99999);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att,Pokemon def){ //"This attack never misses."
        return true;
    }

    @Override
    protected String describe(){
        return "использует Faint Attack";
    }
}
