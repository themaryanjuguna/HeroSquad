package models;

import java.util.ArrayList;

public class post {

    private final String content;
    private static ArrayList<post> instances = new ArrayList<>();

    public post(String content){
        this.content = content;
        instances.add(this);
    }

    public String getContent() {
        return content;
    }

    public static ArrayList<post> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }

}