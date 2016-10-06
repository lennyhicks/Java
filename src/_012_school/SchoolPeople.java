package _012_school;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class SchoolPeople {
    Boolean isAdministration;
    String Name;
    String lastName;
    int Age;


    public SchoolPeople(Boolean isAdmin, String name, String last, int age){
        isAdministration = isAdmin;
        lastName = last;
        Name = name;
        Age = age;
    }

    public String getFullName(){
        return Name + " " + lastName;
    }

    public int getAge(){
        return Age;
    }

    public boolean getAdmin(){
        return isAdministration;
    }
}
