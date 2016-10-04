package _004_inputandoutput;

/**
 * Created by lennyhicks on 10/3/16.
 * Getting user data
 */

import java.util.Scanner;


public class UserInput {
    public Boolean debugEnabled = true;

    public String name;
    Scanner inputInfo = new Scanner(System.in);

    public static void main(String[] args) {
        UserInput basic = new UserInput();
        basic.startProgram();
    }

    public void startProgram() {

        debug("This is the beginning of our basic Inputs training");
        //debug("Enter your name below");

        //name = inputInfo.nextLine();
        //debug("Thank you "+ name);

        challengeOne();
    }

    public void challengeOne() {
        String info = "";
        System.out.println("Enter your age");
        info += "Your age is "+inputInfo.nextInt()+".";
        System.out.println("Enter your city of birth");
        info += " You was born in "+inputInfo.next()+".";
        System.out.println("Enter a fun fact");
        info += " Your fun fact is "+inputInfo.nextLine()+".";
        System.out.println(info);

    }



    public void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }
}


