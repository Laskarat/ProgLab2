package mypokemons;

import mymoves.Facade;
import mymoves.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stantler extends Pokemon {
    public Stantler(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(73, 95, 62, 85, 65, 85);
        super.setMove(new Facade(), new Tackle());
    }
}
