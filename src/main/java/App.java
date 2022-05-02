import models.hero;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
            String name = request.queryParams("name");
           String dob = request.queryParams("dob");
            String strength = request.queryParams("strength");
            String weakness = request.queryParams("weakness");
            hero newHero = new hero(name, dob, strength, weakness);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
