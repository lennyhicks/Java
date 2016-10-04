package _007_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lennyhicks on 10/3/16.
 */
public class Array {

    public Boolean debugEnabled = true;
    Scanner inputInfo = new Scanner(System.in);
    int[] classAges = {73, 44, 53, 23, 76, 19};

    public static void main(String[] args) {
        Array basic = new Array();
        basic.startProgram();
    }

    public void startProgram() {

        debug("This is the beginning of our basic Array training");
        challengeOne();
        challengeTwo();
        challengeThree();
        debug(Arrays.toString(classAges));
    }

    public void challengeOne() {

    }

    public void challengeTwo() {

    }

    public void challengeThree() {

    }

    public void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }


}



