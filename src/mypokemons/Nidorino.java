package mypokemons;

import mymoves.Flatter;
import mymoves.SmartStrike;
import mymoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidorino extends Pokemon {
    public Nidorino(String name, int level){
        super(name, level);
        super.setType(Type.POISON);
        super.setStats(61, 72, 57, 55, 55, 65);
        super.setMove(new SmartStrike(), new Swagger(), new Flatter());
    }
}
