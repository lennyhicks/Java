package _012_school;

import _010_inheritance.Teacher;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class School {

    ArrayList<Students> youngins = new ArrayList<>();


    public static void main(String[] args){
        School school = new School();
        school.start();
    }
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH");

    Calendar calendar = new GregorianCalendar(2016,2,31,9,0);
    int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY);


    public void start(){
        System.out.println(sdf.format(calendar.getTime()));
        Students jack = new Students(false, "Jack", "Jill", 20, 9);
        Students jill = new Students(false, "Jill", "Jack", 20, 10);

        Administration sally = new Administration(true, "Sally", "Pierce", 32);
        Administration pete = new Administration(true, "Pete", "Moore", 32);

        Teacher tom = new Teacher(true, "Tom", "Polly", 26);
        Teacher bob = new Teacher(true, "Bob", "Barker", 25);
        addStudent(tom);
        addStudent(tom);
        addStudent(tom);
    }

    public void addStudent(Teacher you){
        if (you.getAdmin()){
            Scanner inputLine = new Scanner(System.in);
            System.out.print("What is the First name of the student you would like to add to the system.");
            String name = inputLine.nextLine();
            System.out.print("What is the Last name of the student you would like to add to the system.");
            String lastName = inputLine.nextLine();
            System.out.print("What is the Age of the student you would like to add to the system.");
            int age = inputLine.nextInt();

            Students stu = new Students(false, name, lastName, age, 0);
            youngins.add(stu);
            System.out.format("Student ", youngins);

        } else {
            System.out.print("You do not have the permission to do that.");
        }
    }

    private String toString(ArrayList<Students> youngins) {
        return youngins + "@" + Integer.toHexString(hashCode());
    }
}
