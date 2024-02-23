public class Perk {
    String name; // name of the perk
    int maxTier; // maximum tier provided by the perk (example Critical Eye (Expert) = 7)
    int decoTier; // tier of decoration the perk can be found on (1 for t1 and t4, 2 for t2, 3 for t3)

    public Perk(String name, int max, int deco) {
        this.name = name;
        this.maxTier = max;
        this.decoTier = deco;
    }
}
