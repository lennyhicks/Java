package test;

import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question1 {
    // Create an array list with numbers 1 - 10
    // Print out size of array list
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args){
        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.size());
    }
}
