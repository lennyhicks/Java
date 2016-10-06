package _010_inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class Manager extends Employee {

    List<Employee> list = new ArrayList<Employee>();
    //String name, int salary, String department, String posistion, int happiness)

    static Manager lenny = new Manager("Lenny", "pass", 1000000, "Computer Engineer","Manager" , 0);
    static Manager nope = new Manager("Nope", "pass", 5, "Noper", "Manager", 0);
    static Cashier other = new Cashier("Other", "pass", 5, "Cashier", "Cashier", 0);


    public static Boolean debugEnabled = true;
    static Boolean loggedIn = false;

    static Scanner inputInfo = new Scanner(System.in);


    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {


        debug("This is the beginning of our basic variable training");
        challengeOne();
/*
        debug(e1.displayEmployeeInfo());
        debug(m1.displayEmployeeInfo());
        debug(m2.displayEmployeeInfo());
        Cashier.newCashier();
        m1.setSalary(100);
        debug(m1.displayEmployeeInfo());
        */

    }

    public static void challengeOne() {
if (!loggedIn) {
    debug("What is your login Credentials?");
    debug("Please enter your username?");
    String user = inputInfo.next();
    debug("What is your password?");
    String pass = inputInfo.nextLine();
    checkLogin(user, pass);
}
        while(true){
            debug("What would you like to work on today.\n" +
                    "1. List all current Employees. \n" +
                    "2. Add an Employee.\n" +
                    "3. Edit a current Employee pay \n" +
                    "4. Fire an Employee.");

            Scanner inputInfo = new Scanner(System.in);
            int choice = inputInfo.nextInt();
            if (choice == 1){
                listEmployees();
            }
            if (choice == 2){
                addEmployee();
            }
            if (choice == 3){

                debug("Please enter your username?");
                String user = inputInfo.next();
                debug("What is the employees name you wish to edit?");
                String pass = inputInfo.nextLine();
                raiseEmployee(lenny, other, 100);
            }
            if (choice == 4){
                fireEmployee();
            }

        }

    }


    public static void listEmployees(){
        debug("Set up stuff");
        challengeOne();
    }
    public static void addEmployee(){
        debug("Set up stuff");

        challengeOne();
    }
    public static void raiseEmployee(Employee you, Employee emp, int pay){
        debug(you.displayEmployeeInfo());
        if (you.department.equals("Manager")){
            if(emp.department == "Cashier"){
                emp.setSalary(pay);
            }else{
                debug("You do not have the rights to change this employees pay.");
            } debug("You have successfully changed "+emp.name+ "'s salary to $"+pay);
        }else{
            debug("You do not have the permissions to do that!");
        }
        challengeOne();
    }




    public static void checkLogin(String you, String pass){
        Employee.name = you;
        debug(Employee.displayEmployeeInfo());
    }




    public static void fireEmployee(){
        debug("Set up stuff");
        challengeOne();

    }



    public Manager(String name, String pass, int salary, String department, String posistion, int happiness) {

        super(name, pass, salary, department, posistion, happiness);
    }



    public static void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);

        }
    }


    public static String displayEmployeeInfo() {
String empInfo = Employee.displayEmployeeInfo();
        return empInfo + "Department: " + department +"\n";

    }


}
