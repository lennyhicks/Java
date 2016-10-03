package _001_helloWorld;

/**
 * Created by lennyhicks on 10/3/16.
 * This class prints hello world
 */
public class HelloWorld {
    public static Boolean debugEnabled = true;

    public static void main(String args[]) {
        HelloWorld hello = new HelloWorld();
        hello.startProgram();
    }

    public void startProgram(){
        debug("Hello World");
        debug("Lenny Hicks");
        debug("How many feet does a parakeet elephant have?");
        debug("None they are non existent. HAHA");
        challengeOne();

    }
    public void challengeOne() {

        debug("First Challenge");
        System.out.println("Hello World");
        System.out.println("Hello, World!");
        System.out.println("Hello Class");
        System.out.println("Hello, Nurse!");
    }

    public  void debug(String debugString){
        if (debugEnabled) {
            System.out.println(debugString);
        } else {
            System.out.println("Debug is not enabled");
        }
    }
}
