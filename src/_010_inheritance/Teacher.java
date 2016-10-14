package _010_inheritance;

import _012_school.SchoolPeople;

/**
 * Created by lennyhicks on 10/6/16.
 */
public class Teacher extends SchoolPeople{



    public Teacher(String name, String last, String pass, boolean isAdmin, int age) {
        super(name, last, pass, isAdmin, age);
    }
}
