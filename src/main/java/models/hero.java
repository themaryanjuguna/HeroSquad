package models;

import java.util.ArrayList;

public class hero {

    private final String name;
    private final String dob;
    private final String strength;
    private final String weakness;
    private final String chooseSquad;
    private Integer heroNo;



    private static ArrayList<hero> instances = new ArrayList<>();

    public hero(String name, String dob, String strength, String weakness, String chooseSquad, Integer heroNo){
        this.name = name;
        this.dob = dob;
        this.strength = strength;
        this.weakness = weakness;
        this.chooseSquad = chooseSquad;
        this.heroNo = heroNo;
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
    public String getChooseSquad() {
        return chooseSquad;
    }
    public Integer getHeroNo(){
         return heroNo++;  }


    public static ArrayList<hero> getAll(){
        return instances;
    }

    public static void clearAllHeroes(){
        instances.clear();
    }

}