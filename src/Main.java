//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import mypokemons.Stantler;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Stantler stantler = new Stantler("Pidor", 1);
        b.addAlly(p1);
        b.addFoe(stantler);
        b.go();
    }
}