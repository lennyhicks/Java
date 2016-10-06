package _012_school;

/**
 * Created by lennyhicks on 10/5/16.
 */
public class Administration extends SchoolPeople {

    public void addTeachers() {
        Administration sally = new Administration(true, "Sally", "Pierce", 32);
        Administration pete = new Administration(true, "Pete", "Moore", 32);
    }
    public Administration(Boolean isAdmin, String name, String lastName, int age) {
        super(isAdmin, name, lastName, age);
    }
}
