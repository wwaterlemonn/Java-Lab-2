package pokemonset;

import ru.ifmo.se.pokemon.*;
import moveset.*;

public class Charmander extends Pokemon{
    public Charmander(){
        super();
    }

    public Charmander(String name, int level){
        super(name, level);

        setType(Type.FIRE);
        setStats(39,52,43,60,50,65);

        DragonBreath dragonBreath = new DragonBreath();
        setMove(dragonBreath);
    }
}
