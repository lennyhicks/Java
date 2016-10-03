package _002_variables;


/**
 * Created by lennyhicks on 10/3/16.
 * Going over basic concepts of variables.
 */
public class BasicConcepts {
    public Boolean debugEnabled = true;
    public String userName = "Lenny Hicks";
    public int newNumber = 2147483647;

    public static void main(String[] args) {
        BasicConcepts basic = new BasicConcepts();
        basic.startProgram();
    }

    public void startProgram() {
        debug("This is the beginning of our basic variable training");
        challengeOne();

    }

    public void challengeOne() {

        debug("First Challenge");
        debug("My name is " + userName);
        System.out.println("This is my Number " + newNumber);
        System.out.println("Is debug enabled? " + debugEnabled);
        newNumber++;
        System.out.println(newNumber);


    }

    public void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }
}
