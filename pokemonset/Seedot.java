package pokemonset;

import ru.ifmo.se.pokemon.*;
import moveset.*;

//Double Team,Shadow Ball
public class Seedot extends Pokemon{
    public Seedot(){
        super();
    }

    public Seedot(String name, int level){
        super(name, level);

        setType(Type.GRASS);
        setStats(40,40,50,30,30,30);

        DoubleTeam doubleTeam = new DoubleTeam();
        ShadowBall shadowBall = new ShadowBall();
        setMove(doubleTeam, shadowBall);
    }
}
