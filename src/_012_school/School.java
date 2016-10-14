package _012_school;

import java.util.ArrayList;


/**
 * Created by lennyhicks on 10/5/16.
 */
public class School {

    ArrayList<Students> youngins = new ArrayList<>();
    Boolean getAdmin;

    public static void main(String[] args){
        School school = new School();
        school.start();

    }

    public void start(){
        SchoolPeople sch = new SchoolPeople("blah", "blah", "blah", false, 0);
        sch.login();

    }


    public void debug(String msg){
        System.out.println(msg);
    }
}
