package _012_school;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class Students extends SchoolPeople {
    int checkInTime = 9;



    public Students(String name, String lastName, String password, Boolean isAdmin,  int age, int time) {
        super(name, lastName, password, isAdmin, age);
        String isLate = getIsLate(time);
        System.out.println(name + " was " + isLate + " today.");

    }



    public String getIsLate(int time){
        if (time > checkInTime){
            return "late";
        } else {return "on time";}
    }
}
