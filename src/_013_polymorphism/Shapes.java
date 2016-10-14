package _013_polymorphism;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by lennyhicks on 10/6/16.
 */
public class Shapes extends Applet {



    private int x;
    private int y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void set(int len, int wid){
        this.x = len;
        this.y = wid;
    }
    public Shapes(int len, int wid){
        setX(len);
        setY(wid);
    }

    public void draw(){
        System.out.println("Drawing shapes at coordinates "+ getX() +", " +getY());

    }


}
