package Moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

final public class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING,120, 70);
    }
    private boolean flag;
    @Override
    protected void  applyOppEffects(Pokemon p){
        if (Math.random()<=0.1){
            p.setMod(Stat.SPECIAL_DEFENSE,-1);
            flag=true;
        }
    }
    @Override
    protected String describe(){
        if (flag){
            return "Использует Focus Blast и снижает спец.защиту на 1";
        }
        return "Использует Focus Blast";
    }

}
