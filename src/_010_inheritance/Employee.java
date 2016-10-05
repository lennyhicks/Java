package _010_inheritance;

/**
 * Created by lennyhicks on 10/4/16.
 */
public class Employee {

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;
    protected String name;
    protected String department;
    protected String posistion;
    protected int happiness;


public Employee(String n, int s){
    name = n;
    salary = s;

}
    public Employee(String n, int s, String p, int happy) {
        name = n;
        salary =s;
        posistion = p;
        happiness = happy;
    }

    public Employee(String n, int s, String p) {
        name = n;
        salary =s;
        posistion = p;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }


    public String displayEmployeeInfo() {
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
