import java.util.*;
/**
 * The purpose of this program is to play an frc match
 * 
 * ALex Bellon
 * March 25 2015
 */
public class Driver 
{      
    public static void Main() { //main thing with try and catch
        boolean jjj = false;
        while (jjj == false){
            try {
                Stuff();
                jjj = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Please enter an integer.");
            }
        }
    }

    public static void Stuff() throws InputMismatchException { //main game
        boolean go = false;
        Scanner scan = new Scanner(System.in);
        FreshPrinceOfTeamAir fpota = new FreshPrinceOfTeamAir();
        while(go==false) {
            System.out.println("Practice time! Do you want to \na) Say team slogan to boost morale \nb) Run into boxes to demonstrate your speed \nc) Break your 3D printed parts to show your strength\nd) Go to the match"); 
            String input5 = scan.nextLine();
            while (!(input5.equals("a")||input5.equals("b")||input5.equals("c")||input5.equals("d"))) { //error handling
                System.out.println("\nPlease enter a, b, c or d.");
                input5 = scan.nextLine();
                input5 = input5.toLowerCase();
            }
            switch (input5) { //prctice
                case "a":
                fpota.TeamSlogan();
                break;
                case "b":
                fpota.RunIntoBoxes();
                break;
                case "c":
                fpota.BreakParts();
                break;
                case "d":
                go = true;
                break;
                default:
                System.out.println("ERROR");
                break;
            }
        }
        if (go == true) {
            int turns = 20;
            int team1 = 0;
            int team2 = 0;
            System.out.println("What is your team number?");
            int team = scan.nextInt();
            scan.nextLine();
            if (team == 5667) { //5667 auto win
                System.out.println("\nYou automatically win beacuse you are better than everyone else!");
                turns = 0;
                team1 = 100;
            }
            else {
                System.out.println("Welcome to the FRC Competition! Today we have Team 666 versus Team "+team+". GO!");
                while (turns > 0) { //20 turns
                    System.out.println("\nYou have "+turns+" turns left. What would you like to do?\na)Move \nb)Adjust Forklift \nc)Turn robot on/off \nd)Interact with totes");
                    String input = scan.nextLine();
                    input = input.toLowerCase();
                    while (!(input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d"))) { //error handling
                        System.out.println("\nPlease enter a, b, c, or d.");
                        input = scan.nextLine();
                        input = input.toLowerCase();
                    }
                    switch (input) {
                        case "a": System.out.println("\nWhich way would you like to move? \na)Forward \nb)Backward \nc)Left \nd)Right"); //move
                        String input1 = scan.nextLine();
                        while (!(input1.equals("a")||input1.equals("b")||input1.equals("c")||input1.equals("d"))) { //error handling
                            System.out.println("\nPlease enter a, b, c, or d.");
                            input1 = scan.nextLine();
                            input1 = input1.toLowerCase();
                        }
                        switch (input1) { //moving
                            case "a":
                            fpota.MoveFB(false);
                            break;
                            case "b":
                            fpota.MoveFB(true);
                            break;
                            case "c":
                            fpota.MoveLR(false);
                            break;
                            case "d":
                            fpota.MoveLR(true);
                            break;
                            default:
                            System.out.println("ERROR");
                            break;
                        }
                        break;
                        case "b": System.out.println("\nWhat would you like to do with the forklifts? \na)Move up \nb)Move down \nc)Move together"); //forklift
                        String input2 = scan.nextLine();
                        while (!(input2.equals("a")||input2.equals("b")||input2.equals("c"))) { //error handling
                            System.out.println("\nPlease enter a, b, or c.");
                            input2 = scan.nextLine();
                            input2 = input2.toLowerCase();
                        }
                        switch (input2) { //forklift
                            case "a":
                            fpota.MoveUp();
                            break;
                            case "b":
                            fpota.MoveDown();
                            break;
                            case "c":
                            fpota.MoveTogether();
                            break;
                            default:
                            System.out.println("ERROR");
                            break;
                        }           
                        break;
                        case "c": System.out.println("\nWhat would you like to do with the robot? \na)Turn on \nb)Turn off"); //on/off
                        String input3 = scan.nextLine();
                        while (!(input3.equals("a")||input3.equals("b"))) { //error handling
                            System.out.println("\nPlease enter a or b");
                            input3 = scan.nextLine();
                            input3 = input3.toLowerCase();
                        }
                        switch (input3) { //off on
                            case "a":
                            fpota.TurnOffOn(true);
                            break;
                            case "b":
                            fpota.TurnOffOn(false);
                            break;
                            default:
                            System.out.println("ERROR");
                            break;
                        } 
                        break;
                        case "d": System.out.println("\nWhat would you like to do with the totes? \na)Pick up \nb)Move tote \nc)Put down"); //totes
                        String input4 = scan.nextLine();
                        while (!(input4.equals("a")||input4.equals("b")||input4.equals("c"))) { //error handling
                            System.out.println("\nPlease enter a, b, or c.");
                            input4 = scan.nextLine();
                            input4 = input4.toLowerCase();
                        }
                        switch (input4) {//totes
                            case "a":
                            fpota.PickUpTote();
                            break;
                            case "b":
                            fpota.MoveTote();
                            break;
                            case "c":
                            fpota.SetDownTote();
                            team1++;
                            break;
                            default:
                            System.out.println("ERROR");
                            break;
                        } 
                        break;
                        default:
                        System.out.println("ERROR");
                        break;
                    }
                    turns--;
                    Random random = new Random();
                    int kdjsgh = random.nextInt(20)+1;
                    team2=kdjsgh; //auto give points to other team
                }
            }
            if (team1 > team2) { //user wins
                fpota.Win();
            }
            else if (team1 < team2) { //comp wins
                fpota.Lose();
            }
            else { //tie
                System.out.println("\nTHERE ARE NO TIES IN FRC. YOU SLAUGHTER THE OTHER ROBOT AND TEAM AND WIN.");
                fpota.Win();
            }
        }
    }
}
