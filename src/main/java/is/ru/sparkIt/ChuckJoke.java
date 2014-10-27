package is.ru.sparkit;

import net.joningi.icndb.ICNDBClient;
import net.joningi.icndb.Joke;

public class ChuckJoke {
    final ICNDBClient client = new ICNDBClient();

    public String getRandom(){
        return client.getRandom().getJoke();
    }

    public String getSpecific(int num){
        Joke joke = client.getById(num);
        return joke.getJoke();
    }
}
