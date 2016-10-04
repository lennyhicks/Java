package _003_numbers;

/**
 * Created by lennyhicks on 10/3/16.
 */
public class Operators {
    public Boolean debugEnabled = true;
    public String firstName = "Lenny Hicks";
    public int newNumber = 2147483647;
    public int age = 25;
    public int birthYear = 1990;
    public String daysYouveProgrammed = "Too many to Count";
    public int numSiblings = 4;

    public static void main(String[] args) {
        Operators basic = new Operators();
        basic.startProgram();
    }

    public void startProgram() {
        debug("This is the beginning of our basic Operators training");
        //challengeOne();
        challengeTwo();
    }

    public void challengeOne() {

        debug("First Challenge");
        debug("My name is " + firstName);
        debug("My age is "+ age);
        debug("I was born in " +birthYear);
        debug("Days I have programmed? " + daysYouveProgrammed);
        debug("I have " + numSiblings + " Siblings.");


    }

    public void challengeTwo(){
        double bankAccount;
        int pantsPrice = 30;
        int phonePrice = 800;
        int hatPrice = 30;
        bankAccount = 999999;

        double receipt = (pantsPrice + phonePrice + hatPrice)*1.06;
        System.out.println("Your total with taxes was "+ receipt);
        bankAccount = bankAccount - receipt;
        System.out.println("You have " + bankAccount + " remaining in your account.");

        int payDay = 100000;
        bankAccount = bankAccount + payDay;
        System.out.println("Your bank after payday contains $"+bankAccount);
        System.out.println("Your Spouse is leaving you half your bank account");
        bankAccount = bankAccount/2;
        System.out.println("Your bank after divorce contains $"+bankAccount);
        System.out.println("A generous stranger multiplies your bank account by 10");
        bankAccount = bankAccount*10;
        System.out.println("Your account now contains $"+bankAccount);
        System.out.println("Your spouse wants to divide your Seven vacation properties and only give you the remainder.");
        int vacationProperties = 7;
        int remainder = vacationProperties%3;
        System.out.println("You are down to " + remainder + " vacation properties.");

    }


    public void debug(String debugString) {
        if (debugEnabled) {
            System.out.println(debugString);
        }
    }
}
