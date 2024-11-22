package MyPokemons;
import ru.ifmo.se.pokemon.Type;
import Moves.*;

public class Nuzleaf extends Seedot{
    public Nuzleaf(String name,int level){
        super(name,level);
        setType(Type.GRASS,Type.DARK);
        setStats(70,70,40,60,40,60);
        setMove(new Facade(),new Rest(),new Extrasensory());
    }
}
