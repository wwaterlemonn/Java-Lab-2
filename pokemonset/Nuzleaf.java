package pokemonset;

import ru.ifmo.se.pokemon.*;
import moveset.*;

//Double Team,Shadow Ball, Growth
public class Nuzleaf extends Seedot{
    public Nuzleaf(){
        super();
    }
    public Nuzleaf(String name, int level){
        super(name, level);

        addType(Type.DARK);
        setStats(70,70,40,60,40,60);

        Growth growth = new Growth();
        addMove(growth);
    }
}
