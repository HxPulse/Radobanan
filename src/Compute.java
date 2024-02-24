import java.util.ArrayList;

public class Compute {

    // optimizeDecorations ne prend pas encore en compte les perks donnés par les armures / armes, #TODO

    public static ArrayList<Decoration> optimizeDecorations(ArrayList<Perk> perksWanted, SlotsAvailable slots) {
        // Prend la liste des perks voulus par l'utilisateur ainsi que les slots qu'il a de disponibles pour optimiser et renvoyer le meilleur setup possible
       ArrayList<Decoration> setup = new ArrayList<>();

        int totalSlots = slots.getTotalSlotsRequired(false);    // On regarde cb de slots l'utilisateur a.
        int totalPerkSlots = 0;
        for (Perk p : perksWanted) {
            totalPerkSlots += p.maxTier;            // On regarde cb de slots il faut pour maxer tous les perks demandés par l'utilisateur
        }

        if (totalPerkSlots > totalSlots) {
            System.out.println("Some asked perks will not be maxed due to a lack of decoration slots");
        }





        return setup;
    }
}
