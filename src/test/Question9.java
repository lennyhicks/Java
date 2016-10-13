package test;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question9 {
    //Create a method in this class, then create a subclass of this class.
    //Have the subclass override the method you created.
    public static void main(String[] args){
nope.printSomething();
    }
    public static void printSomething() {
        System.out.println("Change this in your subclass.");
    }
}

 class nope extends Question9 {
        public static void printSomething() {
            System.out.println("Changed.");
        }
}
