package Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static Game.Main.debug;

/**
 * Created by lennyhicks on 10/8/16.
 * work on json npc loading
 * two sub arrays, Enemies and NPCs
 * enemy{rat{"Name: Rat", "Health: 10", "Attack: 1", "Defense: 1", "Strength: 1"}
 *  skeleton{"Name: Skeleton", "Health: 10", "Attack: 1", "Defense: 1", "Strength: 1"}}
 *
 */
public class NPC {

    public static String Name;
    public static int Gold, currHealth, Attack, Defense, Strength;


    public static void loadNPC(String name){
        String csvFile = "npcs/"+name+".csv";
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";


        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] Npc = line.split(cvsSplitBy);



                Name = Npc[0];
                Gold = Integer.parseInt(Npc[1]);
                currHealth = Integer.parseInt(Npc[2]);
                Attack = Integer.parseInt(Npc[3]);
                Defense = Integer.parseInt(Npc[4]);
                Strength = Integer.parseInt(Npc[5]);

            debug("Loaded "+Name + " Attack: "+Attack);

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
    }
}
