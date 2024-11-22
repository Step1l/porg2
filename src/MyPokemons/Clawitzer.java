package MyPokemons;
import ru.ifmo.se.pokemon.Type;
import Moves.*;

public class Clawitzer extends Clauncher{
    public Clawitzer(String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(71,73,88,120,89,59);
        setMove(new FlashCannon(),new SwordsDance(),new WaterGun(), new FocusBlast());
    }
}
