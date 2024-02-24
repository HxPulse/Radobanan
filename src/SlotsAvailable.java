import java.util.HashMap;

public class SlotsAvailable {

// HashMap<Integer, Integer> SlotsAvailable : HashMap qui représente : taille du slot / nombre disponible
    // (exemple : t1,6  t2,3  t3,0  t4,2 means t1 : 6 slots, t2 : 3 slots, t3 : 0 slot, and t4 : 2 slots)

    HashMap<String, Integer> activeSlots; // Nombre de slots disponibles. Donné par l'utilisateur
    HashMap<String, Integer> mantleSlots; // Mantle (Cape) slots

    public SlotsAvailable(int t1, int t2, int t3, int t4) {
        this.activeSlots.put("t1", t1);
        this.activeSlots.put("t2", t2);
        this.activeSlots.put("t3", t3);
        this.activeSlots.put("t4", t4);
    }

    public SlotsAvailable(int t1, int t2, int t3, int t4, int t1m, int t2m, int t3m, int t4m) {
        this(t1, t2, t3, t4);

        this.mantleSlots.put("t1", t1m);
        this.mantleSlots.put("t2", t2m);
        this.mantleSlots.put("t3", t3m);
        this.mantleSlots.put("t4", t4m);
    }

    public int getTotalSlotsRequired(boolean withMantle) {
        // Calcul du nombre total de slots que l'utilisateur a.
        int totalSlotsRequired = this.activeSlots.get("t1") + this.activeSlots.get("t2") + this.activeSlots.get("t3") + this.activeSlots.get("t4") * 2;
        if (withMantle) {
            totalSlotsRequired += this.mantleSlots.get("t1") + this.mantleSlots.get("t2") + this.mantleSlots.get("t3") + this.mantleSlots.get("t4") * 2;
        }
        return totalSlotsRequired;
    }
}
