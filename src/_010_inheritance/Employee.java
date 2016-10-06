package _010_inheritance;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class Employee {

    public void setSalary(int salary) {
        this.salary = salary;
    }

    static int salary;
    protected static String name;
    protected static  String password;
    protected  static String posistion;
    protected  static String department;
    protected  static int happiness;


    public Employee(String n, String pass, int s, String p, String d, int happy) {
        name = n;
        password = pass;
        salary =s;
        posistion = p;
        department = d;
        happiness = happy;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }


    public static String displayEmployeeInfo() {
        if (happiness > 5) {
            return "Name: " + name + "\n" +
                    "Salary: " + salary + "\n" +
                    "Posistion: " + posistion + "\n" +
                    "We are glad your kinda Happy." + "\n";


        } else if (happiness > 0) {
            return "Name: " + name + "\n" +
                    "Salary: " + salary + "\n" +
                    "Posistion: " + posistion + "\n" +
                    "How can we make you happy." + "\n";
        }  return "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Posistion: " + posistion + "\n";
    }


}
