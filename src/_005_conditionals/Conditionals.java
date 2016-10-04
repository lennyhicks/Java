package _005_conditionals;

import java.util.Scanner;

/**
 * Created by lennyhicks on 10/3/16.
 */
public class Conditionals {

    public Boolean debugEnabled = true;
public boolean chickenForLunch = true;
    public String name;
    Scanner inputInfo = new Scanner(System.in);

    public static void main(String[] args) {
        Conditionals basic = new Conditionals();
        basic.startProgram();
    }

    public void startProgram() {

        debug("This is the beginning of our basic Conditionals training");
if (chickenForLunch){
    debug("You are getting chicken.");
}
        challengeOne();
        challengeTwo();
    }

    public void challengeOne() {
        int availableCashForShipping = 10;
        if (availableCashForShipping > 50){
            debug("Your best option for shipping would be Next day air");
        } else if (availableCashForShipping > 25){
            debug("Your best option for shipping would be Two day air.");
        } else if (availableCashForShipping > 5){
            debug("Your best option for shipping would be Three day ground.");
        } else {
            debug("I hope they offer free shipping cause you brpke.");
        }
    }

    public void challengeTwo() {
        String password = "reallyHard";
        int guesses = 5;
        debug("Please enter your password");
        while (guesses > 0) {
            String newPass = inputInfo.next();
            guesses--;
            if (newPass.equals(password)) {
                debug("You now have access to your account");
                guesses = 0;
            } else {
                debug("You have entered an incorrect password. You have "+guesses+" attempts remaining.");
            }
        }
    }



    public void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }
}
