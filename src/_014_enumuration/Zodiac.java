package _014_enumuration;

/**
 * Created by lennyhicks on 10/6/16.
 */
public enum Zodiac {
    CAPRICORN("January"),
    AQUARIUS("Febuary"),
    PISCES("March"),
    ARIES("April"),
    TAURUS("May"),
    GEMINI("June"),
    CANCER("July"),
    LEO("August"),
    VIRGO("September"),
    LIBRA("October"),
    SCORPIO("November"),
    SAGITTARIUS("December");

    private String horoSign;


    Zodiac(String horoSign){
        this.horoSign = horoSign;
    }

    public String getHoroSign() {
        return horoSign;
    }

    public static String getMonth(String month){
        return month;
    }
}
