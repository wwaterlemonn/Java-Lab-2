package pokemonset;

import ru.ifmo.se.pokemon.*;
import moveset.*;

//Shock Wave, Quick Attack, Confide
public class Blitzle extends Pokemon{
    public Blitzle(){
        super();
    }
    public Blitzle(String name, int level){
        super(name, level);

        setType(Type.ELECTRIC);
        setStats(45,60,32,50,32,76);

        ShockWave shockWave = new ShockWave();
        QuickAttack quickAttack = new QuickAttack();
        Confide confide = new Confide();
        setMove(shockWave, quickAttack, confide);
    }
}