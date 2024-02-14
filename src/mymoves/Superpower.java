package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Superpower extends PhysicalMove {
    public Superpower(){
        super(Type.FIGHTING, 120, 100);
    }
    @Override
    protected String describe(){
        return "суперпавер";
    }
}
