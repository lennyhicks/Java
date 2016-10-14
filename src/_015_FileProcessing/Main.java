package _015_FileProcessing;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        Main m = new Main();
        m.doMath();

    }

    public void doMath(){
        double numerator, denom, result;
        Scanner in = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        try {
            System.out.println("Please enter a numerator");
            numerator = in.nextInt();
            System.out.println("Please enter a denomerator");
            denom = in.nextInt();
            result = numerator / denom;
            System.out.println("The result is " + df2.format(result));

        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
            doMath();
        }
    }

}