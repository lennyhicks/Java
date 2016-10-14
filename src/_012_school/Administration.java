package _012_school;

import java.util.Scanner;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class Administration extends SchoolPeople {
    static Boolean isAdmin;
    public void addTeachers() {
        Administration sally = new Administration("Sally", "Pierce", "pass", true, 32);
        Administration pete = new Administration("Pete", "Moore", "pass", true, 32);
    }
    public Administration( String name, String lastName, String password, Boolean isAdmin, int age) {
        super(name, lastName, password, isAdmin, age);
    }

    static Scanner inputLine = new Scanner(System.in);




}
