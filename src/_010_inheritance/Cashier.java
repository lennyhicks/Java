package _010_inheritance;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class Cashier extends Employee {
public static int happy;

    public Cashier(String n, int s, String p, int happy) {
        super(n, s, p, happy);
    }
public void main(String[] args) {
}

public static void newCashier(){

    Scanner inputInfo = new Scanner(System.in);
    out.println("How happy are you?");
    happy = inputInfo.nextInt();
    Cashier c1 = new Cashier("Noob", 10000, "Cashier", happy);
    System.out.println(c1.displayEmployeeInfo());
}
}
