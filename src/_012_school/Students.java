package _012_school;

import com.sun.jmx.snmp.Timestamp;
import com.sun.prism.shader.DrawRoundRect_ImagePattern_AlphaTest_Loader;

import java.time.Instant;
import java.util.Date;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class Students extends SchoolPeople {
    int checkInTime = 9;

    public void addStudents() {

    }

    public Students(Boolean isAdmin, String name, String lastName, int age, int time) {
        super(isAdmin, name, lastName, age);
        String isLate = getIsLate(time);
        System.out.println(name + " was " + isLate + " today.");

    }



    public String getIsLate(int time){
        if (time > checkInTime){
            return "late";
        } else {return "on time";}
    }
}
