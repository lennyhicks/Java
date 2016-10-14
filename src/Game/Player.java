package Game;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lennyhicks on 10/8/16.
 */
public class Player extends Main {
    static ArrayList<Integer> expForLevel = new ArrayList<>();
    Game game = new Game();
    static String UserName, Password;
    static int Gold, maxHealth, currHealth, attackExp, attack, defenseExp, defense, strengthExp, strength;

    public static void getExpLevel(){
        int maxLevel = 99;
        int currExp = 1;
        int currLevel = 1;
            for (int i = 1; i <= maxLevel; i++){
                    if (currExp < 7){
                        currExp *= 2;
                        currLevel++;
                        expForLevel.add(currExp);

                        //debug("Exp for level " + currLevel + " is " + currExp);
                    } else if (currExp < 100){
                        currExp *= 1.25;
                        currLevel++;
                        expForLevel.add(currExp);
                    } else {
                        currExp *= 1.15;
                        currLevel++;
                        expForLevel.add(currExp);
                        //debug("Exp for level " + currLevel + " is " + currExp);
                    }
            }
        }



    public void startGame(){
        getExpLevel();
        //debug(""+ expForLevel);
        //debug(""+expForLevel.size());
        debug("What would you like to do today?");
        debug("1.) Login");
        debug("2.) New User");
        int choice = input.nextInt();
        choice(choice);

    }
    public void choice(int choice){
        switch (choice){
            case 1 : load(); break;
            case 2 : newPlayer(); break;
        }
    }
    public void load(){

        Scanner userw = new Scanner(System.in);
        Scanner passw = new Scanner(System.in);

        debug("Please enter your userName");
        String name = userw.nextLine();

        debug("Please enter your password");
        String pass = passw.nextLine();
        login(name, pass);

    }

    public static int getLevel(int exp){
        int level = 1;
        for (int i = 1; i < expForLevel.size(); i++){
            if (expForLevel.get(i) <= exp){
                level++;
            }
        }
        return level;
    }

    public void login(String name, String pass){
        String csvFile = "players/"+name+".csv";
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";


        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] player = line.split(cvsSplitBy);

                UserName = player[0];
                Password = player[1];
                Gold = Integer.parseInt(player[2]);
                maxHealth = Integer.parseInt(player[3]);
                currHealth = Integer.parseInt(player[4]);
                attackExp = Integer.parseInt(player[6]);
                attack = getLevel(attackExp);
                defenseExp = Integer.parseInt(player[8]);
                defense = getLevel(defenseExp);
                strengthExp = Integer.parseInt(player[10]);
                strength = getLevel(strengthExp);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (name.equals(UserName) && pass.equals(Password)) {

            game.startMainGame();
        }
        else {
            debug("Failed Login please try again.");
            load();
        }

    }

    public void newPlayer(){

        Scanner userw = new Scanner(System.in);
        Scanner passw = new Scanner(System.in);

        debug("Please enter your userName");
        String name = userw.nextLine();
        debug("Please enter your password");
        String pass = passw.nextLine();
        UserName = name;
        Password = pass;
        Gold = 100;
        maxHealth = 100;
        currHealth = 100;
        attack = 1;
        attackExp = 0;
        defense = 1;
        defenseExp = 0;
        strength = 1;
        strengthExp = 0;
        debug("Saved player: " +name);
        save();
        login(name, pass);
    }


    public static void save() {

        String player = "";
        try {
            player += (UserName + ","+ Password+","+ Gold+","+ maxHealth+","+ currHealth+","+ getLevel(attackExp) +","+ attackExp
                    +","+ getLevel(defenseExp)+","+ defenseExp+","+ getLevel(strengthExp)+","+ strengthExp);
            File file = new File("players/"+UserName+".csv");
            debug(UserName+": Saved");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(player);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getNextExp(int level){
        if (level < 99){
            return ""+expForLevel.get(level);
        }
        else return "Max Level";
    }

    public static void displayStats(){
        debug("Stats for UserName: "+UserName);
        debug("Gold = "+Gold);
        debug("Health = "+currHealth+"/"+maxHealth);
        debug("Attack Level = " +getLevel(attackExp)+ ". Attack Exp = "+attackExp+"/"+getNextExp(getLevel(attackExp)));
        debug("Defense Level = " +getLevel(defenseExp)+ ". Defense Exp = "+defenseExp+"/"+getNextExp(getLevel(defenseExp)));
        debug("Strength Level = " +getLevel(strengthExp)+ ". Strength Exp = "+strengthExp+"/"+getNextExp(getLevel(strengthExp)));

        Game.startMainGame();

    }
}
