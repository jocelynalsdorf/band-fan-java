import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
	public static void main(String[] args) {
		staticFileLocation("/public");

		get("/", (request, response) -> {
			return new ModelAndView(new HashMap(), "templates/home.vtl");
		}, new VelocityTemplateEngine());

		get("/fan_page", (request, response) -> {
			return new ModelAndView(new HashMap(), "templates/fan_page.vtl");
		}, new VelocityTemplateEngine());


	}
}