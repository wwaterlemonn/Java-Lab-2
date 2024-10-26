package pokemonset;

import ru.ifmo.se.pokemon.*;
import moveset.*;

//Shock Wave, Quick Attack, Confide, Overheat
public class Zebstrika extends Blitzle{
    public Zebstrika(){
        super();
    }
    
    public Zebstrika(String name, int level){
        super(name, level);

        setStats(75,100,63,80,63,116);

        Overheat overheat = new Overheat();
        addMove(overheat);
    }
}
