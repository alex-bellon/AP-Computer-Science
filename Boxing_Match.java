/**
Alex Bellon
The purpose of this program is to play rock paper scissors against the computer
Sept. 29 2014 V 1.0
 */
import java.util.*;
public class Boxing_Match
{
    public static void box()
    {
        String newgame;
        newgame = "y";

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int user;
        user = 0; // attack/defend
        int userdirection;
        userdirection = 0; // move/attack l,c,r        
        int comp; 
        comp = 0; //move/attack
        int compdirection;
        compdirection = 0; // move/attack l,c,r
        
        String replay;
        replay = "y";
        
        int userhealth;
        int comphealth;
        int damage; 
        userhealth = random.nextInt(20)+20; //random = users health
        comphealth = userhealth; //comp has same health
        damage = userhealth/5;
        
        int win;
        int lose;
        win = 0;
        lose = 0;

        while (replay.equals("y")) {
            //takes another turn
            if (userhealth > 0 && comphealth > 0) {
                System.out.println("Let's box! Choose '1' to attack, or '2' to defend."); //choice of user
                user = scan.nextInt();
                while (!(user == 1 || user == 2)){
                    System.out.println("Please choose '1' to attack or '2' to defend.");
                    user = scan.nextInt();
                }            

                comp = random.nextInt(2)+1; //comp chooses attack or defend
                compdirection = random.nextInt(3)+1; //comp chooses which way to attack/dodge

                switch (user) { 
                    case 1: //user attacks
                    System.out.println("Would you like to attack to the left ('1'), straight ahead ('2'), \nor to the right ('3')?");
                    userdirection = scan.nextInt();
                    while (!(user == 1 || user == 2 || user == 3)) {
                        System.out.println("Please choose '1', '2', or '3'.");
                        userdirection = scan.nextInt();
                    }
                    switch (userdirection) {
                        case 1: //attacks left
                        if (comp == 1){ // comp attacking
                            if (compdirection == 1) {
                                //if the user attacks left and the computer attacks left
                                comphealth = comphealth - damage;
                                userhealth = userhealth - damage;
                                System.out.println("You hit the computer and dealt " + damage + " damage. It has "+ comphealth + " health left.\nThe computer hit you and dealt " 
                                    + damage + " damage. You have " + userhealth + " health left." );                                                     
                            }
                            if (compdirection == 2 || compdirection == 3) {
                                System.out.println("You attack and miss. You have "+userhealth+" health left.\nThe computer attacks and misses. It has "+comphealth+" health left.");
                            }
                        }
                        if (comp == 2) { //comp defending
                            if (compdirection == 1) {
                                //if the user attacks left and the computer defends left
                                userhealth = userhealth - damage;
                                System.out.println("You hit the computer and dealt 0 damage. It has "+ comphealth + " health left.\nThe computer defended against you and dealt " 
                                    + damage + " damage. You have " + userhealth + " health left.");                                               
                            }
                            if (compdirection == 2 || compdirection == 3) {
                                System.out.println("You attack and miss. You have "+userhealth+" health left.\nThe computer dodges you. It has "+comphealth+" health left.");
                            }
                        }
                        break;
                        case 2: //attacks middle
                        if (comp == 1){ // comp attacking
                            if (compdirection == 2) {
                                //if the user attacks center and the computer attacks center    
                                comphealth = comphealth - damage;
                                userhealth = userhealth - damage;
                                System.out.println("You hit the computer and dealt " + damage + " damage. It has "+ comphealth + " health left.\nThe computer hit you and dealt " 
                                    + damage + " damage. You have " + userhealth + " health left.");                                              
                            }
                            if (compdirection == 1 || compdirection == 3) {
                                System.out.println("You attack and miss. You have "+userhealth+" health left.\nThe computer attacks and misses. It has "+comphealth+" health left.");
                            }
                        }
                        if (comp == 2) { //comp defending
                            if (compdirection == 2) {
                                //if the user attacks left and the computer defends left
                                userhealth = userhealth - damage;
                                System.out.println("You hit the computer and dealt 0 damage. It has "+ comphealth + " health left.\nThe computer defended against you and dealt " 
                                    + damage + " damage. You have " + userhealth + " health left.");                                                     
                            }
                            if (compdirection == 1 || compdirection == 3) {
                                System.out.println("You attack and miss. You have "+userhealth+" health left.\nThe computer dodges you. It has "+comphealth+" health left.");
                            }
                        }
                        break;
                        case 3: //attacks right
                        if (comp == 1){ // comp attacking
                            if (compdirection == 3) {
                                //if the user attacks center and the computer attacks center    
                                comphealth = comphealth - damage;
                                userhealth = userhealth - damage;
                                System.out.println("You hit the computer and dealt " + damage + " damage. It has "+ comphealth + " health left.\nThe computer hit you and dealt " 
                                    + damage + " damage. You have " + userhealth + " health left.");                                                   
                            }
                            if (compdirection == 1 || compdirection == 2) {
                                System.out.println("You attack and miss. You have "+userhealth+" health left.\nThe computer attacks and misses. It has "+comphealth+" health left.");
                            }
                        }
                        if (comp == 2) { //comp defending
                            if (compdirection == 3) {
                                //if the user attacks left and the computer defends left
                                userhealth = userhealth - damage;
                                System.out.println("You hit the computer and dealt 0 damage. It has "+ comphealth + " health left.\nThe computer defended against you and dealt " 
                                    + damage + " damage. You have " + userhealth + " health left.");                                                     
                            }
                            if (compdirection == 1 || compdirection == 2) {
                                System.out.println("You attack and miss. You have "+userhealth+" health left.\nThe computer dodges you. It has "+comphealth+" health left.");
                            }
                        }
                        break;
                        default:
                        System.out.println("Oops, there seems to be a problem. Please try quitting the program and restarting");
                        break;
                    }
                    break;
                    case 2:
                    System.out.println("Would you like to dodge to the left ('1'), straight ahead ('2'), \nor to the right ('3')?");
                    userdirection = scan.nextInt();
                    while (!(user == 1 || user == 2 || user == 3)) {
                        System.out.println("Please choose '1', '2', or '3'.");
                        userdirection = scan.nextInt();
                    }
                    switch (userdirection) {
                        case 1: //dodges left
                        if (comp == 1){ // comp attacking
                            if (compdirection == 1) {
                                //if the user dodges left and the computer attacks left
                                comphealth = comphealth - damage;

                                System.out.println("You blocked the computer and dealt" + damage + " damage. It has "+ comphealth + " health left.\nThe computer hit you and dealt 0 damage. You have " + userhealth + " health left." );                                                     
                            }
                            if (compdirection == 2 || compdirection == 3) {
                                System.out.println("You dodge the computer. You have "+userhealth+" health left.\nThe computer attacks and misses. It has "+comphealth+" health left.");
                            }
                        }
                        if (comp == 2) { //comp defending
                            if (compdirection == 1) {
                                //if the user defends left and the computer defends left
                                System.out.println("You dodged the computer. It has "+ comphealth + " health left.\nThe computer dodged you. You have " + userhealth + " health left.");                                               
                            }
                            if (compdirection == 2 || compdirection == 3) {
                                System.out.println("You dodge the computer. You have "+userhealth+" health left.\nThe computer dodges you. It has "+comphealth+" health left.");
                            }
                        }
                        break;
                        case 2: //defends middle
                        if (comp == 1){ // comp attacking
                            if (compdirection == 2) {
                                //if the user defends center and the computer attacks center    
                                comphealth = comphealth - damage;
                                System.out.println("You blocked the computer and dealt " + damage + " damage. It has "+ comphealth + " health left.\nThe computer hit you and dealt 0 damage. You have " + userhealth + " health left.");                                              
                            }
                            if (compdirection == 1 || compdirection == 3) {
                                System.out.println("You dodge the computer. You have "+userhealth+" health left.\nThe computer attacks and misses. It has "+comphealth+" health left.");
                            }
                        }
                        if (comp == 2) { //comp defending
                            if (compdirection == 2) {
                                //if the user defends left and the computer defends left
                                System.out.println("You dodged the computer and dealt 0 damage. It has "+ comphealth + " health left.\nThe computer defended against you and dealt 0 damage. You have " + userhealth + " health left.");                                                     
                            }
                            if (compdirection == 1 || compdirection == 3) {
                                System.out.println("You dodge the computer. You have "+userhealth+" health left.\nThe computer dodges you. It has "+comphealth+" health left.");
                            }
                        }
                        break;
                        case 3: //defends right
                        if (comp == 1){ // comp attacking
                            if (compdirection == 3) {
                                //if the user defends right and the computer attacks right    
                                comphealth = comphealth - damage;

                                System.out.println("You dodged the computer and dealt " + damage + " damage. It has "+ comphealth + " health left.\nThe computer hit you and dealt 0 damage. You have " + userhealth + " health left.");                                                   
                            }
                            if (compdirection == 1 || compdirection == 2) {
                                System.out.println("You attack and miss. You have "+userhealth+" health left.\nThe computer attacks and misses. It has "+comphealth+" health left.");
                            }
                        }
                        if (comp == 2) { //comp defending
                            if (compdirection == 3) {
                                //if the user dodges right and the computer defends right
                                userhealth = userhealth - damage;
                                System.out.println("You dodged the computer and dealt 0 damage. It has "+ comphealth + " health left.\nThe computer defended against you and dealt 0 damage. You have " + userhealth + " health left.");                                                     
                            }
                            if (compdirection == 1 || compdirection == 2) {
                                System.out.println("You dodge the computer. You have "+userhealth+" health left.\nThe computer dodges you. It has "+comphealth+" health left.");
                            }
                        }
                        break;
                        default:
                        System.out.println("Oops, there seems to be a problem. Please try quitting the program and restarting");
                        break;
                    }
                    break;
                    default:
                    System.out.println("Oops, there seems to be a problem. Please try quitting the program and restarting");
                    break;
                }
            }
            if (userhealth <= 0) {
                System.out.println("You lost! Would you like to play again? Please answer [y/n]");
                newgame = scan.nextLine();
                while (!(newgame.equals("y")||newgame.equals("n"))){
                    System.out.println("Please enter 'y' or 'n'");
                    newgame = scan.nextLine();
                }
                if (newgame.equals("n")){
                    replay = "n";
                    System.out.println("Wins: "+win+"\nLosses: "+lose);
                }
                else if (newgame.equals("y")){  
                    userhealth = random.nextInt(20)+20; //random = users health
                    comphealth = userhealth; //comp has same health
                    damage = userhealth/5; //damage == 1/5 of the health
                    lose++;
                }
            }
            else if (comphealth <= 0 ) {
                System.out.println("You won! Would you like to play again? Please answer [y/n]");
                newgame = scan.nextLine();
                scan.nextLine();
                while (!(newgame.equals("y")||newgame.equals("n"))){
                    System.out.println("Please enter 'y' or 'n'");
                    newgame = scan.nextLine();
                }
                if (newgame.equals("n")){
                    replay = "n";
                    System.out.println("Wins: "+win+"\nLosses: "+lose);
                }
                else if (newgame.equals("y")){
                    replay = "y";       
                    userhealth = random.nextInt(20)+20; //random = users health
                    comphealth = userhealth; //comp has same health
                    damage = userhealth/5; //damage == 1/5 of the health
                    win++;
                }
            }
        }
    }
}   

