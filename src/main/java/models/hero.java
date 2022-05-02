package models;

import java.util.ArrayList;

public class hero {

    private final String name;
    private final String dob;
    private final String strength;
    private final String weakness;

    private static ArrayList<hero> instances = new ArrayList<>();

    public hero(String name, String dob, String strength, String weakness){
        this.name = name;
        this.dob = dob;
        this.strength = strength;
        this.weakness = weakness;
        instances.add(this);
    }

    public String getName() {
        return name;
    }
    public String getDob() {
        return dob;
    }
    public String getStrength() {
        return strength;
    }
    public String getWeakness() {
        return weakness;
    }


    public static ArrayList<hero> getAll(){
        return instances;
    }

    public static void clearAllHeroes(){
        instances.clear();
    }

}