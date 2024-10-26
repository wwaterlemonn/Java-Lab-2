package moveset;

import ru.ifmo.se.pokemon.*;

public class ShockWave extends SpecialMove{
    public ShockWave(){
        super(Type.ELECTRIC, 60, 99999);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att,Pokemon def){ //"This attack cannot be evaded."
        return true;
    }

    @Override
    protected String describe(){
        return "использует Shock Wave";
    }
}
