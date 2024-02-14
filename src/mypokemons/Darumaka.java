package mypokemons;

import mymoves.Confide;
import mymoves.Headbutt;
import mymoves.Superpower;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Darumaka extends Pokemon {
    public Darumaka (String name, int level){
        super(name, level);
        super.setType(Type.FIRE);
        super.setStats(70, 90, 45, 15, 45, 50);
        super.setMove(new Superpower(), new Confide(), new Headbutt());
    }
}
