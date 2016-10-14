package _013_polymorphism;

import java.awt.*;

/**
 * Created by lennyhicks on 10/6/16.
 */
public class Main {


    public static void main(String[] args){
        Shapes s = new Shapes(1,1);
        s.draw();
        Rectangle rec = new Rectangle(70,10,1,1);
        Circle cir = new Circle(20,20);
        cir.draw();
        rec.draw();
    }


}
