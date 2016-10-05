package _009_classes;

import java.util.ArrayList;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class Car {



    public String make;
    public String model;
    public int year;
    public ArrayList<String> owners = new ArrayList<>();

    public int tires;
    public int doors;
    public int seating;
    public int wheels;


    public void getWheels(int wheels){
        if (wheels < 4){
            System.out.print("Your car is broken with only " +wheels+ " wheels");
        }else {System.out.print("Your car is running fine with all wheels.");}
    }


}
