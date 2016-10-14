package _013_polymorphism;

/**
 * Created by lennyhicks on 10/6/16.
 */
public class Circle extends Shapes {

    public int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int len, int wid) {
        super(len, wid);
    }





    public void draw(){
        System.out.println("Drawing Circle with a Diamater of " +getX());
        int length = getX();
        int height = getY();

        System.out.println("X: "+ length + " Y: " +height);
        String len = "";
        for (int i = 1; i <= length; i++){

            int distance = 50 - i;

            String en = "";
            for (int d = 1; d < distance; d++){
                en += " ";
                len = en;
            }

                for (int l = 1;l < i; l++) {
                    len += "==";
                    if (i > height/2) {
                        len = len.substring(3, len.length());
                    }


            }
            System.out.println(len);
        }


    }
}
