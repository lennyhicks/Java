package _009_classes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class LearningClasses {


    public static Boolean debugEnabled = true;



    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        debug("This is the beginning of our basic variable training");
        challengeOne();

    }

    public static void challengeOne() {
        Scanner inputInfo = new Scanner(System.in);
        Car car = new Car();
        car.make = "Ford";
        car.model = "Focus";
        car.year = 2014;
        car.owners.add("Lenny");
        car.doors = 4;
        car.tires = 4;
        car.seating = 5;
        car.wheels = 4;

        //debug(car.make);
        car.getWheels(car.wheels);

/*
        debug("Enter your string");
        String nope = inputInfo.nextLine();
        int vowelCount = checkVowels(nope);
        debug(""+vowelCount);


*/
        debug("Enter your Temp to convert to Celsius");
        int nope = inputInfo.nextInt();
        int blah = fToC(nope);
        debug(""+blah);



    }

    static int squareNumber(int num){
        return num*num;
    }


    static int checkVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char check = str.charAt(i);
            if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
                count++;
            }

        }
        return count;
    }




   // c= f-32*5/9


    public static int fToC(int temp){
        temp = (temp - 32) *5/9;
        return temp;
    }




    public static void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }
}
