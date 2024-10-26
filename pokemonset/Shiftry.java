package pokemonset;

import ru.ifmo.se.pokemon.*;
import moveset.*;

//Double Team,Shadow Ball, Growth, Faint Attack
public class Shiftry extends Nuzleaf{
    public Shiftry(){
        super();
    }

    public Shiftry(String name, int level){
        super(name, level);

        setStats(90,100,60,90,60,80);
        
        FaintAttack faintAttack = new FaintAttack();
        addMove(faintAttack);
    }
}
