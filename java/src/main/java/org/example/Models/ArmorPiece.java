package org.example.Models;

import java.util.HashMap;
import java.util.List;

public class ArmorPiece {
    private int id;
    private int type;
    private String name;
    private int rank;
    private int rarity;
    private int defense;
    private HashMap<String, Integer> resistances;//(type, value)
    private List<Integer> slots;//(size)
    private HashMap<Skill, Integer> skills;//(id, level)
    private ArmorSet armorSet;


}
