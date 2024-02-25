package org.example.Models;

import java.util.HashMap;
import java.util.List;

public class ArmorSet {
    private int id;
    private String name;
    private String rank;
    private List<ArmorPiece> armorPieces;
    private List<Integer> bonuses; //(id is level and value is number of pieces required to activate)
}
