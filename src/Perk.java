public class Perk {
    String name; // nom du perk
    int maxTier; // tier max que peut avoir le perk (exemple Critical Eye (Expert) = 7)
    int decoTier; // tier de la decoration sur laquelle on peut trouver le perk (1 = t1 and t4, 2 = t2, 3 = t3)

    public Perk(String name, int max, int deco) {
        this.name = name;
        this.maxTier = max;
        this.decoTier = deco;
    }

    // # TODO : A partir du nom du perk, pouvoir récupérer le maxTier et le decoTier du perk (que l'on aura stocké qqe part j'imagine)
    public Perk(String name) {
        this.name = name;
        // this.maxTier =;
        // this.decoTier =;
    }
}
