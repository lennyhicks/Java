package test;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question5 {
    // Create a subclass that inherits and uses the methods and properties from this class
    String myName = "The Johnny";
public static void main(String[] args){
    Maybe maybe = new Maybe();
    maybe.print();
}
    public void printName(String name) {
        System.out.println(name);
    }


}
class Maybe extends Question5{
    public void print(){
        super.printName("This Works");
    }
}