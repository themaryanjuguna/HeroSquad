package models;

import java.util.ArrayList;

public class hero {

    private final String name;
    private static ArrayList<hero> instances = new ArrayList<>();

    public hero(String name){
        this.name = name;
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public static ArrayList<hero> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }

}