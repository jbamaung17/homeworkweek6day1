import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class MagicEightBall {
    private ArrayList <String> answers;

    public MagicEightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public ArrayList<String> getAnswer() {
        return answers;
    }

    public void setAnswer(ArrayList<String> answers) {
        this.answers = answers;
    }

    public void add(String answer){
        this.answers.add(answer);
    }

    public int getWordCount(){
        return this.answers.size();
    }

    public String getRandomAnswer(){
        Collections.shuffle(answers);
        return answers.get(0);
    }


}
