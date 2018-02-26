import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestMagicEightBall {
     private MagicEightBall magicEightBall;

     @Before
    public void before() {
    ArrayList<String> answers = new ArrayList<>();
    answers.add("Don't leave the house");
    answers.add("Put on the lottery");
    answers.add("Don't eat any devilled eggs after 3 o'clock");
    magicEightBall = new MagicEightBall(answers);
     }

     @Test
    public void canAddItem(){
         magicEightBall.add("The police will find you, hide!");
         assertEquals(4, magicEightBall.getWordCount());
     }

     @Test
    public void canGetRandomAnswer(){
         ArrayList results = magicEightBall.getAnswer();
         String randomAnswer = magicEightBall.getRandomAnswer();
         assertTrue(results.contains(randomAnswer));
     }


}
