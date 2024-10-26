package moveset;

import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove{
    public AquaRing(){ 
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        /*может складываться и лечить очень много хп за ход, но пофиксить это доступными средствами нет возможности,
        разве что удалить возможность его использования навсегда через
        p.setMoves(), что не очень хорошо потому что во-первых, хил можно в теории снять и тогда имеет смысл наложить его снова,
        а во-вторых, нужно ввести конкретный набор мувов покемона в аргументы, что невозможно, если есть другой пользовтель aqua ring*/
        super.applySelfEffects(p);
        Effect heal = new Effect().stat(Stat.HP, (int) -Math.floor(p.getStat(Stat.HP)/16)).turns(-1);
        p.addEffect(heal);
    }

    @Override
    protected String describe(){
        return "использует Aqua Ring";
    }
}
