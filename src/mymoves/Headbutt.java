package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Headbutt extends PhysicalMove {
    public Headbutt(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected String describe(){
        return "хедбатт";
    }
}
