import ru.ifmo.se.pokemon.*;
import pokemonset.*;

public class Lab2 {
    public static void main(String[] args){
        //Wishiwashi, Blitzle, Zebstrika, Seedot, Nuzleaf, Shiftry
        Battle b = new Battle();
        Wishiwashi wishiwashi = new Wishiwashi("Карась Иннокентий", 36);
        Blitzle blitzle = new Blitzle("Зёбра", 11);
        Zebstrika zebstrika = new Zebstrika("Большой зёбра", 27); //Новый мув Overheat изучается через диск, взял мин. уровень для эволюции
        Seedot seedot = new Seedot("Жёлудь", 1); //Ур.1 т.к. оба мува из дисков
        Nuzleaf nuzleaf = new Nuzleaf("Росток", 14); //Growth изучается на 9 ур., эволюция с 14 ур.
        Shiftry shiftry = new Shiftry("Дуб", 14); //Faint Attack на 1 ур., эволюция через предмет
        b.addAlly(wishiwashi);
        b.addAlly(blitzle);
        b.addAlly(zebstrika);
        b.addFoe(seedot);
        b.addFoe(nuzleaf);
        b.addFoe(shiftry);
        b.go();
    }
}