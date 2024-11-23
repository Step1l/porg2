package Moves;
import ru.ifmo.se.pokemon.*;

final public class SteamEruption extends SpecialMove {
    public SteamEruption(){
        super(Type.WATER,110,95);
    }
    private boolean flag;
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<=0.3){
            p.setCondition(new Effect().condition(Status.BURN));
            flag=true;
        }

    }
    @Override
    protected String describe(){
        if (flag){
            return "Использует Steam Eruption  и поджигает";
        }
        return "Использует Steam Eruption";
    }
}
