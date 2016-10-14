package Game;

import java.util.Scanner;

import static Game.Main.debug;

/**
 * Created by lennyhicks on 10/8/16.
 */
public class Gamble extends Game{

    public static void startGamble(){
        Scanner chooseYourDestiny = new Scanner(System.in);
        debug("You currently have "+Player.Gold+" Gold. How would you like to Gamble "+Player.UserName);
        debug("1.) Random Number Game");
        debug("2.) Dice Game");
        debug("3.) Return to main Menu");
        int gamblings = chooseYourDestiny.nextInt();
        gameRNG(gamblings);
    }
    public static void gameRNG(int gamblings){

        switch (gamblings){
            case 1 : startRNG(); break;
            case 2 : startDice(); break;
            case 3 : startMainGame(); break;
        }

    }

    public static void startRNG(){
        Scanner chooseYourDestiny = new Scanner(System.in);
        debug("Winning this game will payout 7x");
        debug(("Coming within one of the winning number will payout 2x"));
        debug("How much gold would you like to bet today?");
        int bet = chooseYourDestiny.nextInt();
        if (bet <= Player.Gold && bet > 0){
            guessRNG(bet);
        } else {
            debug("Please enter a bet amount that you have and over 0");
            startRNG();
        }
    }
    public static void guessRNG(int bet){
        Scanner enterGuess = new Scanner(System.in);
        debug("Enter your Guess 1-10");
        int guess = enterGuess.nextInt();
        if (guess > 0 && guess < 11) {
            if (bet < Player.Gold) {
                Player.Gold = Player.Gold - bet;
                debug("You now have " + Player.Gold + " Gold.");
                int answer = (int) rollDice(5);
                if (answer == guess) {
                    debug("You won the jackpot.");
                    Player.Gold += bet * 7;
                    debug("You now have " + Player.Gold + " Gold.");
                } else if (answer - 1 == guess || answer + 1 == guess) {
                    debug("You won the mini prize");
                    Player.Gold += bet * 2;
                    debug("You now have " + Player.Gold + " Gold.");
                } else {
                    debug("You lost. Your guess was " + guess + " the answer was " + answer);

                }
            } else {
                guessRNG(bet);
            }
        }else{
            debug("Please input a Gold amount that you have.");
            Player.save();
            startGamble();
        }
        Player.save();
        startGamble();
    }
    public static double rollDice(int num){
        double diceOne = Math.floor(Math.random() * num + 1);
        double diceTwo = Math.floor(Math.random() * num + 1);
        return Math.round(diceOne + diceTwo);
    }

    public static void startDice(){
        Scanner enterBet = new Scanner(System.in);
        Scanner enterGuess = new Scanner(System.in);
        debug("Enter your bet");
        int bet = enterBet.nextInt();
        Player.Gold -= bet;
        debug("You bet " + bet + " Gold. You now have " + Player.Gold + " Gold.");
        debug("Would you like to guess Low/Mid/High");
        debug("High/Low Payout 2x");
        debug("Mid (5-7) Payout 4x");
        debug("1.) Low");
        debug("2.) Mid");
        debug("3.) High");
        debug("4.) Return to menu");

        int guess = enterGuess.nextInt();
        String guessResults = guessResults(guess);
        int answer = (int)rollDice(6);
        String rollResults = gameResults(answer);
        debug("Guess: " +guessResults+ " - Roll: "+ answer + " Result: "+rollResults);
        if(guessResults.equals("MID") && rollResults.equals("MID")){
            Player.Gold += bet * 4;
            debug("You Won the Grand Prize. You now have " +Player.Gold + " Gold.");
        } else if (guessResults.equals(rollResults)) {
            Player.Gold += bet * 4;
            debug("You Won the Runner-Up prize. You now have " + Player.Gold + " Gold");
            debug("You Lose");
        }
        Player.save();
        startGamble();

    }
    public static String guessResults(int roll){

        switch (roll){
            case 1 :return "LOW";
            case 2 :return "MID";
            case 3 :return "HIGH";
            default: startMainGame(); return "NONE";
        }

    }

    public static String gameResults(int roll){

        switch (roll){
            case 1 :
            case 2 :
            case 3 :
            case 4 :return "LOW";
            case 5 :
            case 6 :
            case 7 :return "MID";
            case 8 :
            case 9 :
            case 10 :
            case 11 :
            case 12 :return "HIGH";
            default:return "NONE";
        }
    }
}
