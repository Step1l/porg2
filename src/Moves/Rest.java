package Moves;
import ru.ifmo.se.pokemon.*;

final public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setCondition(new Effect().turns(2).condition(Status.SLEEP));
        p.restore();
    }
    @Override
    protected String describe(){
        return "Использует Rest";
    }
}
