package _000_BaseFormat;

import _009_classes.Car;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class Format {



    public static Boolean debugEnabled = true;

    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        debug("This is the beginning of our basic variable training");
        challengeOne();

    }

    public static void challengeOne() {

    }

    public static void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }





}
