package MyPokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.*;

public class Clauncher extends Pokemon {
     public Clauncher(String name,int level){
        super(name,level);
        setType(Type.WATER);
        setStats(50,53,62,58,63,44);
        setMove(new FlashCannon(),new SwordsDance(),new WaterGun());


    }
}
