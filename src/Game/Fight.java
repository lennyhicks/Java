package Game;

import java.util.Scanner;

import static Game.Main.debug;

/**
 * Created by lennyhicks on 10/8/16.
 * Chance to miss = player attack, npc defense rng att def if att > def hit
 * Damage =
 * Defense can save you up to 20 points of damage
 * Speed? better chance to dodge damage
 * Load NPCS like players
 * One time load from a Switch
 * rat, goblin, skeleton, dragon,
 *
 */
public class Fight extends Game{
    String[] npcs = {"Rat", "Goblin", "Skeleton"};

    public void startFight() {
        int npcCount = 0;
        Scanner choice = new Scanner(System.in);
        debug("What would you like to fight?");
        for (int i = 0; i < npcs.length; i++) {
            debug(i + 1 + ".) " + npcs[i]);
            npcCount++;
        }
        debug(npcCount + 1 + ".) Main Menu");
        int opt = choice.nextInt();
        if (opt <= npcCount) {
            NPC.loadNPC(npcs[opt - 1].toUpperCase());
            debug("Loading " + npcs[opt - 1].toUpperCase());
            startBattle();
        } else {
            startMainGame();
        }
    }

    public void startBattle(){

        Player.save();
        if (Player.currHealth > 0 && NPC.currHealth > 0){
            debug(NPC.Name + " has "+NPC.currHealth+" health remaining.");
            Scanner choice = new Scanner(System.in);
            debug("What would you like to do?");
            debug("1.) Attack");
            debug("2.) Item");
            debug("3.) Heal");
            debug("4.) Run");
            int opt = choice.nextInt();
            switch (opt){
                case 1: attackNpc(); break;
                case 2: useItem(); break;
                case 3: healSelf(); break;
                default: runAway();
            }
        } else if (Player.currHealth > 0 && NPC.currHealth == 0){
            debug("You have defeated "+NPC.Name);
            startFight();
        }
    }

    public void attackNpc(){
        boolean hit = getHit(Player.getLevel(Player.attackExp), NPC.Defense);
        if (hit){
            int damage = getDamage(Player.getLevel(Player.strengthExp), NPC.Defense);
            NPC.currHealth -= damage;
            int attGain = NPC.Defense*4;
            int strGain = damage *4;
            Player.attackExp += attGain;
            if (Player.attack < Player.getLevel(Player.attackExp)){
                debug("Congratulations you have leveled up your Attack to level "+ Player.getLevel(Player.attackExp));
            }
            Player.strengthExp += strGain;

            if (Player.strength < Player.getLevel(Player.strengthExp)){
                debug("Congratulations you have leveled up your Strength to level "+ Player.getLevel(Player.strengthExp));
            }
            if (NPC.currHealth > 0){
                npcAttack();
            }
            else {
                debug("You have defeated "+NPC.Name+". You gained "+NPC.Gold+" gold.");
                Player.Gold += NPC.Gold;
                startFight();
            }
        } else {
            debug("You missed " + NPC.Name);
            startBattle();
        }
        Player.save();

    }

    public void npcAttack(){
        boolean hit = getHit(NPC.Attack, Player.getLevel(Player.defenseExp));
        if (hit){
            int damage = getDamage(NPC.Strength, Player.getLevel(Player.defenseExp));
            Player.currHealth -= damage;
            debug(NPC.Name + " Hit you for "+damage);
            if(Player.currHealth <= 0){
                debug("Oh dear you have died. Please rest");
                Game.startMainGame();
            }
            debug("You have "+Player.currHealth+" health remaining.");
        } else {
            debug(NPC.Name+ " missed you.");
            int defenseGain = NPC.Attack*4;
            debug("You have gained " +defenseGain+ " Defense Exp.");
            Player.defenseExp += defenseGain;
        }
        startBattle();
    }


    public void useItem(){

    }

    public void healSelf(){
        Player.currHealth = Player.maxHealth;
        npcAttack();
    }

    private void runAway(){
        boolean hit = getHit(Player.getLevel(Player.attackExp), NPC.Defense);
        if (hit){
            debug("You have successfully ran away.");
            startFight();
        }
        debug("You failed to run away");
        npcAttack();
    }
    private int getDamage(int Strength, int Defense){
        int baseDamage = (int)Math.floor(Math.random() * Strength + 1);
        int baseDefense = (int)Math.floor(Math.random() * (Defense/5));
        int damage = baseDamage - baseDefense;
        if (damage > NPC.currHealth){
            damage = NPC.currHealth;
        }
        return damage;
    }


    private boolean getHit(int Attack, int Defense){
        if (Attack >= Defense){
            return true;
        } else {
            int hit = getResult(Attack);
            int def = getResult(Defense);
            return (hit >= def);
        }
    }

    private int getResult(int stat){
        return (int)Math.floor(Math.random() * stat + 1);
    }
}
