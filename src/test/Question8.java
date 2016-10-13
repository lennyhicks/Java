package test;

import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question8 {
    // Copy the array list from the previous question to this one.
    // Iterate over the ArrayList and print out each element.
    public static void main(String[] args){

        ArrayList<String> str = new ArrayList<>();
        str.add("Nope");
        str.add("Maybe");
        str.add("Nah");
        str.add("Ko");
        str.add("Qw");

        for (int i = 0; i < str.size(); i++){
            System.out.println(str.get(i));
        }
    }
}
