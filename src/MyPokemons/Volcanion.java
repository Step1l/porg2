package MyPokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.*;

final public class Volcanion extends Pokemon {
    public Volcanion(String name, int level){
        super(name,level);
        setType(Type.FIRE,Type.WATER);
        setStats(80,110,120,130,90,70);
        setMove(new FlareBlitz(),new Confide(),new FocusBlast(),new SteamEruption());
    }

}
