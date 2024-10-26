package pokemonset;

import ru.ifmo.se.pokemon.*;
import moveset.*;

//Aqua Ring,Confide,Facade,Bulldoze
public class Wishiwashi extends Pokemon {
    public Wishiwashi (){
        super();
    }
    public Wishiwashi(String name, int level){
        super(name, level);

        setType(Type.WATER);
        setStats(45,20,20,25,25,40);

        AquaRing aquaRing = new AquaRing();
        Confide confide = new Confide();
        Facade facade = new Facade();
        Bulldoze bulldoze = new Bulldoze();
        setMove(aquaRing,confide,facade,bulldoze);
    }
}