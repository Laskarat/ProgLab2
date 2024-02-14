package mymoves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Flatter extends StatusMove {
    public Flatter(){
        super(Type.DARK, 0, 100);
    }
    @Override
    protected String describe(){
        return "флаттер";
    }
}
