package test;

import java.util.Scanner;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question2 {
    //Ask a user to add in a number, save it to a variable and print out that variable.
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        int num = input.nextInt();
        System.out.println(num);
    }
}
