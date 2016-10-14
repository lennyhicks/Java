package Game;

import java.util.ArrayList;
import java.util.Scanner;

import static Game.Main.debug;

public class Game {

    public static void startMainGame(){
        ArrayList<String> opts = new ArrayList<>();
        opts.add("Fight a creature");
        opts.add("Gamble your gold away");
        opts.add("Check your stats");
        Scanner chooseYourDestiny = new Scanner(System.in);
        debug("Welcome to the game "+Player.UserName);
        debug("What would you like to do today?");
        for (int i = 0; i < opts.size(); i++){
        debug(i+1 + ".) "+ opts.get(i));
        }

        int destiny = chooseYourDestiny.nextInt();
        game(destiny);
    }

    public static void game(int destiny){

        Fight f = new Fight();
        Gamble g = new Gamble();
            switch (destiny){
                case 1 : f.startFight(); break;
                case 2 : g.startGamble(); break;
                case 3 : Player.displayStats();
            }

    }

}
