package mymoves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL, 0,0);
    }
    @Override
    protected String describe(){
        return "конфиде";
    }
}
