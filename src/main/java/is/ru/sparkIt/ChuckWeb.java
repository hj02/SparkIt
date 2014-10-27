package is.ru.sparkit;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class ChuckWeb implements SparkApplication {
    public static void main(String[] args){
        SparkApplication chuckweb = new ChuckWeb();
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
        chuckweb.init(); 
    }

    public void init(){
        final ChuckJoke chuckjoke = new ChuckJoke();
        
        get(new Route("/"){
            @Override
            public Object handle(Request request, Response response){
                return chuckjoke.getRandom();
            }
        });

        get(new Route("/id/:param"){
            @Override
            public Object handle(Request request, Response response){
                return chuckjoke.getSpecific(Integer.parseInt(request.params(":param")));
            }
        });
    }
}
