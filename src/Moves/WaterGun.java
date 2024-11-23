package Moves;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

final public class WaterGun extends SpecialMove {
    public WaterGun(){
        super(Type.WATER,40,100);
    }
    @Override
    protected String describe(){
    return "Исопльзует Water Gun";
    }
}
