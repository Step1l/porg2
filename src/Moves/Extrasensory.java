package Moves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Extrasensory extends SpecialMove {
    public Extrasensory(){
        super(Type.PSYCHIC,80,100);
    }
    private boolean flag;
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<=0.1) {
            Effect.flinch(p);
            flag=true;
        }
    }
    @Override
    protected String describe(){
        if (flag){
            return "Использует Extrasensory и заставляет вздрогнуть";
        }
        return "Использует Extrasensory";
    }
}
