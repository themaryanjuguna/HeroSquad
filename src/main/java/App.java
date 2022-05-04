import models.hero;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) { //type “psvm + tab” to autocreate this :)
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<hero> heroes = hero.getAll();
            model.put("heroes", heroes);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        post("/heroes/new", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            Set<String> heroNo = request.queryParams();
            String name = request.queryParams("name");
            String dob = request.queryParams("dob");
            String strength = request.queryParams("strength");
            String weakness = request.queryParams("weakness");
            String chooseSquad = request.queryParams("chooseSquad");


            hero newHero = new hero(name, dob, strength, weakness, chooseSquad, 1);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());


        get("/shujaa",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<hero> heroes = hero.getAll();
            String name = request.queryParams("name");
            String dob = request.queryParams("dob");
            String strength = request.queryParams("strength");
            String weakness = request.queryParams("weakness");
            String chooseSquad = request.queryParams("chooseSquad");

            model.put("name", name);
            model.put("dob", dob);
            model.put("strength", strength);
            model.put("weakness", weakness);
            model.put("chooseSquad", chooseSquad);

            return new ModelAndView(model, "shujaa.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
