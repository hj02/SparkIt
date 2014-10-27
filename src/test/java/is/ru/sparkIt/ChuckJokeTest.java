package is.ru.sparkit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ChuckJokeTest {

    final ChuckJoke chuck = new ChuckJoke();    

    @Test
    public void chuckNorrisNameInRandomJoke(){
        String name = "Chuck Norris";
        assertTrue(chuck.getRandom().contains(name));
    }

    @Test
    public void specificJokeById(){
        String chuckJoke = chuck.getSpecific(5);
        String joke = "Chuck Norris lost his virginity before his dad did.";
        assertEquals(chuckJoke, joke);
    }
}
