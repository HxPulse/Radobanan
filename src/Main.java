import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Création des slots disponibles de l'utilisateur (de gauche à droite t1 -> t4)
        SlotsAvailable s = new SlotsAvailable(3, 3, 0, 2);

        // Création des perks voulus
        Perk p = new Perk("Attack Boost", 7,1);
        Perk p2 = new Perk("Dragon Attack", 7, 1);
        ArrayList<Perk> perks = new ArrayList<>();
        perks.add(p);
        perks.add(p2);

        Compute c = new Compute();
        ArrayList<Decoration> decorations = c.optimizeDecorations(perks, s);
    }
}