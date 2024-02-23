import java.util.ArrayList;

public class Decoration {

    ArrayList<Perk> perks; // perk(s) of the decoration
    int decoTier; // tier (1 to 4) of the decoration

    public Decoration(ArrayList<Perk> perks, int tier) {
        this.perks = perks;
        this.decoTier = tier;
    }

    public Decoration(ArrayList<Perk> perks) {
        this.perks = perks;

        if (perks.size() == 2) {
            this.decoTier = 4;
        } else {
            this.decoTier = perks.get(0).decoTier;
        }
    }
}
