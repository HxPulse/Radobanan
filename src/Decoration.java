import java.util.ArrayList;

public class Decoration {

    ArrayList<Perk> perks; // perk(s) de la decoration
    int decoTier; // tier (1 à 4) de la decoration


    public Decoration(ArrayList<Perk> perks) {
        this.perks = perks;

        if (perks.size() == 2) {
            this.decoTier = 4;
        } else {
            this.decoTier = perks.get(0).decoTier;
        }
    }

    public Decoration(ArrayList<Perk> perks, int tier) {
        this(perks);
        this.decoTier = tier;
    }
}
