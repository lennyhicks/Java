package _008_learningArrays;


import _007_arrays.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class LearningArrayList {

        public Boolean debugEnabled = true;
        Scanner inputInfo = new Scanner(System.in);
        int[] classAges = {73, 44, 53, 23, 76, 19};
    int grade1, grade2, grade3, total;
        double average;


        public static void main(String[] args) {
            LearningArrayList basic = new LearningArrayList();
            basic.startProgram();
        }

        public void startProgram() {

            debug("This is the beginning of our basic Array training");
            challengeOne();
            challengeTwo();
            challengeThree();
            debug(Arrays.toString(classAges));
            challengeFour();
        }

        public void challengeOne() {
            grade1 = 78;
            grade2 = 88;
            grade3 = 91;
            total = grade1 + grade2 + grade3;
            average = total/3;

        }

        public void challengeTwo() {
            ArrayList<Integer> grades = new ArrayList<>();
            grades.add(78);
            grades.add(68);
            grades.add(98);
            grades.add(91);

            for (int i = 0; i < grades.size(); ++i) {
                total += grades.get(i);
            }
            debug(""+total);
            debug("Average is " + total / grades.size());
        }

        public void challengeThree() {
            ArrayList<String > names = new ArrayList<>();
            names.add("Jeremiah");
            names.add("Lenny");
            names.add("Crystal");
            names.add("Steve");


            ArrayList<String > greetings = new ArrayList<>();
            greetings.add("Good Morning, ");
            greetings.add("Why are you talking to yourself, ");
            greetings.add("What, ");
            greetings.add("Whoa. ");

            for (int i = 0; i< names.size(); i++){

                debug(greetings.get(i)+names.get(i));
            }

        }



    public void challengeFour() {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            numbers.add(i);
        }
        System.out.println("First "+numbers.get(0)+" Last "+ numbers.get(numbers.size()-1));
    }

        public void debug(String debugString) {
            if (debugEnabled) {
                System.out.println(debugString);
            }
        }


    }


