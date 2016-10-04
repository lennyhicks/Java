package _006_loops;


import javax.script.ScriptEngine;
import java.util.Scanner;

/**
 * Created by lennyhicks on 10/3/16.
 */
public class Loops {

    public Boolean debugEnabled = true;
    Scanner inputInfo = new Scanner(System.in);

    public static void main(String[] args) {
        Loops basic = new Loops();
        basic.startProgram();
    }

    public void startProgram() {

        debug("This is the beginning of our basic Loops training");
        for (int i = 1; i <= 10; i++){
            debug(""+i);
        }
        challengeOne();
        challengeTwo();
        challengeThree();
    }

    public void challengeOne() {
        for (int i = 1; i <= 5; i++){
            debug("Happy Day " +i);
        }

    }

    public void challengeTwo() {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        debug(""+sum);
    }

    public void challengeThree() {
boolean stop = false;
        int equation = 0;
        while (!stop){
if (equation > 0) {
    debug("Would you like to continue?");
    String stopIt = inputInfo.next();
    if (stopIt.equals("no")) {
        return;
    }
}
            int result = 0;
            debug("Please enter your first number");
            int one = inputInfo.nextInt();

            debug("Please enter your second number");
            int two = inputInfo.nextInt();

            debug("What would you like to do with these numbers /,*,+,-");
            String type = inputInfo.next();
            if (type.equals("+") || type.equals("add") || type.equals("sum")) {
                result = one + two;
                type = "+";
            }
            if (type.equals("-") || type.equals("subtract") || type.equals("minus")) {
                result = one - two;
                type = "-";
            }
            if (type.equals("*") || type.equals("multiply")) {
                result = one * two;
                type = "*";
            }
            if (type.equals("/") || type.equals("divide")) {
                result = one / two;
                type = "/";
            }
            debug(one + " " + type + " " + two + " = " + result);
            equation++;
        }

    }

    public void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }
}
