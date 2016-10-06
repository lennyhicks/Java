package _010_inheritance;

import _012_school.SchoolPeople;

/**
 * Created by lennyhicks on 10/6/16.
 */
public class Teacher extends SchoolPeople{

    public Teacher(Boolean isAdmin, String name, String last, int age) {
        super(isAdmin, name, last, age);
    }



}
