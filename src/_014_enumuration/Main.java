package _014_enumuration;

import java.util.Scanner;

/**
 * Created by lennyhicks on 10/6/16.
 */
public class Main {

    public static void main(String[] args){
        Weekday tuesday = Weekday.TUESDAY;
        Zodiac scorpio = Zodiac.SCORPIO;
        System.out.println(scorpio);
        System.out.println(java.util.Arrays.asList(Zodiac.values()));

        Scanner inputLine = new Scanner(System.in);
        System.out.print("What is Your sign.");
        String sign = inputLine.nextLine();
        Zodiac newSign = Zodiac.valueOf(sign.toUpperCase());

        System.out.println(newSign.getHoroSign());
    }
}
