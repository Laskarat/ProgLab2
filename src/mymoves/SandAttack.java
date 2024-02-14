package mymoves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SandAttack extends StatusMove {
    public SandAttack(){
        super(Type.GROUND, 0, 100);
    }
    @Override
    protected String describe(){
        return "сэндаттак";
    }
}
