package mypokemons;

import mymoves.Confide;
import mymoves.Flatter;
import mymoves.SmartStrike;
import mymoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoking extends Pokemon {
    public Nidoking(String name, int level){
        super(name, level);
        super.setType(Type.POISON, Type.GROUND);
        super.setStats(81, 102, 77, 85, 75, 85);
        super.setMove(new SmartStrike(), new Flatter(), new Confide(), new Swagger());
    }
}
