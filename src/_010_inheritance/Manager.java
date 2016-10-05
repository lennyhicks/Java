package _010_inheritance;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class Manager extends Employee {

    private String departments;

    static Manager m1 = new Manager("Lenny", 1000000, "Computer Engineer","THELEET");
    static Manager m2 = new Manager("Nope", 5, "Noper", "Manager");


    public static Boolean debugEnabled = true;

    public Manager(String n, int s, String d, String p) {

        super(n, s , p);
        departments = d;
    }



    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        debug("This is the beginning of our basic variable training");
        challengeOne();

    }

    public static void challengeOne() {
        Employee e1 = new Employee("Lenny", 210120, "Maybe");
        debug(e1.displayEmployeeInfo());
        debug(m1.displayEmployeeInfo());
        debug(m2.displayEmployeeInfo());
        Cashier.newCashier();
        m1.setSalary(100);
        debug(m1.displayEmployeeInfo());

    }

    public static void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }


    public String displayEmployeeInfo() {
String empInfo = super.displayEmployeeInfo();
        return empInfo + "Department: " + departments +"\n";

    }


}
