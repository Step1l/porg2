package MyPokemons;
import ru.ifmo.se.pokemon.Type;
import Moves.*;

final public class Shiftry extends Nuzleaf{
    public Shiftry(String name, int level){
        super(name,level);
        setType(Type.GRASS,Type.DARK);
        setStats(90,100,60,90,60,80);
        setMove(new Facade(),new Rest(),new Extrasensory(),new RockTomb());
    }
}
