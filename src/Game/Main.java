package Game;

import java.util.Scanner;

/**
 * Created by lennyhicks on 10/8/16.
 */
public class Main {
    public static boolean debugEnabled = true;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Main m = new Main();
        m.start();
    }

    public void start(){
        MainGui gui = new MainGui();
        Player p = new Player();
        gui.main(null);
        p.startGame();
    }

    public static void debug(String msg){
        if (debugEnabled){
            System.out.println("\u001B[36m" +msg);
        }
    }
}
