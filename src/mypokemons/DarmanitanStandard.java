package mypokemons;

import mymoves.Confide;
import mymoves.Headbutt;
import mymoves.StoneEdge;
import mymoves.Superpower;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DarmanitanStandard extends Pokemon {
    public DarmanitanStandard (String name, int level){
        super(name, level);
        super.setType(Type.FIRE);
        super.setStats(105, 140, 55, 30, 55, 95);
        super.setMove(new Confide(), new Superpower(), new Headbutt(), new StoneEdge());
    }
}
