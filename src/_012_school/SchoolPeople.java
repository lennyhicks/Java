package _012_school;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static _009_classes.LearningClasses.debug;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class SchoolPeople {
    Boolean isAdministration;
    String Name;
    String lastName;
    int Age;
    int[] intArray = new int[50];
    static Scanner inputLine = new Scanner(System.in);
    int i = 0;
    String people = "";
    String password;
    static ArrayList<Students> youngins = new ArrayList<>();


    public SchoolPeople(String name, String last, String pass, Boolean isAdmin, int age) {
        isAdministration = isAdmin;
        lastName = last;
        password = pass;
        Name = name;
        Age = age;
        people += (name + ","+ last+","+ pass+","+ isAdmin+","+ age);
        System.out.println("Wrote a person " +name);
        save(name);
        System.out.println(people);
        load(name, pass);
    }


    public void save(String name) {
        try {
            File file = new File("people/"+name+".csv");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(people);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String FirstName;
    public static String LastName;
    public static String Password;
    public static Boolean isAdmin;
    public static int age;




public Boolean load(String name, String pass){
    String csvFile = "people/"+name+".csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";


        try {

        br = new BufferedReader(new FileReader(csvFile));
        while ((line = br.readLine()) != null) {

            // use comma as separator
            String[] peoples = line.split(cvsSplitBy);

            System.out.println("Loaded [First Name= " + peoples[0] + ", Last Name=" + peoples[1] + ", Pass=" + peoples[2] + ", Administration=" + peoples[3] + ", Age=" + peoples[4] + "]");


            FirstName = peoples[0];
            LastName = peoples[1];
            Password = peoples[2];
            if (peoples[3] == "true"){
                isAdmin = true;
            } else {
                isAdmin = false;
            }

            age = Integer.parseInt(peoples[4]);

        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    System.out.println(name);
    System.out.println(pass);
    System.out.println(FirstName);
    System.out.println(Password);

    if (name.equals(FirstName) && pass.equals(Password)){
        System.out.println("True");
        return true;
    }
    else {
        System.out.println("Fail");
        return false;}

}

    public void login() {

        debug("Please enter your username");
        Scanner inputLine = new Scanner(System.in);
        String login = inputLine.nextLine();

        debug("Please enter your password");
        String pass = inputLine.nextLine();

        isAdmin = load(login, pass);
        if (isAdmin){
            debug("You have Successfully logged in.");
            prompt();
        } else {
            debug("Please try again.");
            login();
        }
    }
    public void prompt(){
        debug("What would you like to do?");
        debug("1.) Add Student");
        debug("2.) Expel Student");
        debug("3.) Add Grade");


        int choice = inputLine.nextInt();
        switch (choice){
            case 1: addStudent(isAdmin); break;
            case 2: expelStudent(isAdmin); break;

        }

    }
    public void addStudent(Boolean admin){
        if (admin){
            Scanner inputLine = new Scanner(System.in);
            System.out.print("What is the First name of the student you would like to add to the system.");
            String name = inputLine.nextLine();
            System.out.print("What is the Last name of the student you would like to add to the system.");
            String lastName = inputLine.nextLine();
            System.out.print("What is the Age of the student you would like to add to the system.");
            int age = inputLine.nextInt();

            Students stu = new Students(name, lastName, "pass", false, age, 0);
            prompt();

        } else {
            System.out.print("You do not have the permission to do that.");
            prompt();
        }
    }

    public void expelStudent(Boolean admin){
        if (admin){
            Scanner inputLine = new Scanner(System.in);
            System.out.print("What is the First name of the student you would like to Expel.");
            String name = inputLine.nextLine();


        } else {
            System.out.print("You do not have the permission to do that.");
        }
    }




    public String getFullName() {
        return Name + " " + lastName;
    }

    public int getAge() {
        return Age;
    }

    public boolean getAdmin() {
        return isAdministration;
    }

    public void addGrades(Boolean admin) {


        System.out.println("Please enter your grade");
        int e = inputLine.nextInt();
        intArray[i] = e;
        i++;
        addMore(admin);

    }

    public void addMore(Boolean admin) {

        Scanner inputNew = new Scanner(System.in);
        System.out.println("Would you like to enter another? y/n");
        String answer = inputNew.next();


        if (answer.contains("y")) {
            addGrades(admin);
        } else {
            printResults(admin);
        }
    }


    public void printResults(Boolean admin) {
        int results = 0;

        if (admin) {
            for (int l = 0; l < i; l++) {

                System.out.println("Grade book entry " + (l + 1) + " " + intArray[l]);
            }
        } else {
            for (int il = 0; il < i; il++) {
                results += intArray[il];
            }
            System.out.println("Your Average is " + results / i);
        }
    }
}