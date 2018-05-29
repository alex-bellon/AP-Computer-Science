/**
Alex Bellon
The purpose of this program is to play rock paper scissors against the computer
Sept. 29 2014 V 1.0
 */
import java.util.*;
public class Rock_Paper_Scissors
{
    public static void rps()
    {
        Scanner scan = new Scanner(System.in);
        int input;
        Random random = new Random();
        int comp;
        int win = 0;
        int lose = 0;
        String replay;
        replay = "y";      
        while (replay.equals("y")) {
            System.out.println("Let's play rock paper scissors! Choose '1' for rock, '2' for paper,\nor '3' for scissors.");
            input = scan.nextInt();
            while (!(input == 1 || input == 2 || input == 3)) {
                System.out.println("Please choose 1, 2, or 3.");
                input = scan.nextInt();
            }
            comp = random.nextInt(3)+1;
            switch (input) {
                case 1: 
                while (comp == 1) {
                    System.out.println("We tied! Let me choose again...");
                    comp = random.nextInt(3)+1;
                }           
                if (comp == 2) {
                    System.out.println("I won! I chose paper and you chose rock!");
                    lose++;
                }
                if (comp == 3) {
                    System.out.println("You won! I chose scissors and you chose rock!");
                    win++;
                }
                System.out.println("Would you like to play again? [y/n]");
                scan.nextLine();
                replay=scan.nextLine();
                while (!(replay.equals("y") || replay.equals("n"))){
                    System.out.println("Please choose 'y' or 'n'.");
                    replay=scan.nextLine();
                }
                if (replay.equals("n")) {
                    System.out.println("You had "+win+" wins.\nYou had "+lose+" losses.");
                }
                break;
                case 2:
                while (comp == 2) {
                    System.out.println("We tied! Let me choose again...");
                    comp = random.nextInt(3)+1;
                }
                if (comp == 1) {
                    System.out.println("You won! You chose paper and I chose rock!");
                    win++;
                }
                if (comp == 3) {
                    System.out.println("I won! I chose scissors and you chose paper!");
                    lose++;
                }
                System.out.println("Would you like to play again? [y/n]");
                scan.nextLine();
                replay=scan.nextLine();
                while (!(replay.equals("y") || replay.equals("n"))){
                    System.out.println("Please choose 'y' or 'n'.");
                    replay=scan.nextLine();
                }
                if (replay.equals("n")) {
                    System.out.println("You had "+win+" wins.\nYou had "+lose+" losses.");
                }
                break;
                case 3:               
                while (comp == 3) {
                    System.out.println("We tied! Let me choose again...");
                    comp = random.nextInt(3)+1;
                }
                if (comp == 2) {
                    System.out.println("You won! I chose paper and you chose scissors!");
                    win++;
                }
                if (comp == 1) {
                    System.out.println("I won! You chose scissors and I chose rock!");
                    lose++;
                }
                System.out.println("Would you like to play again? [y/n]");
                scan.nextLine();
                replay=scan.nextLine();
                while (!(replay.equals("y") || replay.equals("n"))){
                    System.out.println("Please choose 'y' or 'n'.");
                    replay=scan.nextLine();
                }
                if (replay.equals("n")) {
                    System.out.println("You had "+win+" wins.\nYou had "+lose+" losses.");
                }
                break;
                default:
                System.out.println("Uh oh, there was an error! Please quit the program and start again!");
                break;
            }
        }
    }   

}

