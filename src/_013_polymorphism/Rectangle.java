package _013_polymorphism;

/**
 * Created by lennyhicks on 10/6/16.
 */
public class Rectangle extends Shapes{
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    public Rectangle(int len, int wid, int l, int w) {
        super(len, wid);
        length = l;
        width = w;
    }

    public void draw(){
        System.out.println("Drawing rectangle with a width of "+ getX() +", and a height of " +getY());
        int length = getX();
        int height = getY();
        String len = "";
        for (int i = 1; i <= length; i++){
            len += "-";
        }

        for (int i = 1; i <= height; i++){
            System.out.println(len);
        }
    }
}
