/*
 * Alex Bellon
 * The purpose of this program is to act as a bingo card
 * v1.0
 * jan 3 2014
 */
import java.util.*;
public class Bingo
{
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int [] [] board = new int [5] [5];
    int [] [] duplicate = new int [5] [5];
    boolean bingo = false;
    int mode = 0;

    public Bingo()//play the game
    {
        Play();
    }

    public void Play()  //new game
    {
        mode = 0;
        NewBoard(); 
        PrintBoard();
        DuplicateBoard();
        ChooseGame();
        while (bingo == false) {
            MarkSpot();
            PrintBoard();
            CheckBingo();
        }
    }

    public void ChooseGame() { //choose the modifier
        int input;
        System.out.println("What modifier are you playing?\n0=None\n1=Postage Stamp (DOESN'T WORK)\n2=Borders\n3=X\n4=Fill Board");
        input = scanner.nextInt();
        while (input != 0 && input != 1 && input != 2 && input != 3 &&  input != 4) {
            System.out.println("Please input 0, 1, 2, 3, 4.");
            input = scanner.nextInt();
        }
        mode = input; 
    }

    public void NewBoard() //build a new board array
    {
        for (int row = 0; row<5; row++) {
            for (int column = 0; column<5; column++) {
                if (column==0) { //coulmn 1
                    int number = random.nextInt(15)+1;
                    for (int r = 0; r<5; r++) {
                        while (board [0] [r] == number) {
                            number = random.nextInt(15)+1;
                        }
                    }
                    board [column] [row] = number;
                }
                if (column==1) { //column 2
                    int number = random.nextInt(15)+16;
                    for (int r = 0; r<5; r++) {
                        while (board [1] [r] == number) {
                            number = random.nextInt(15)+16;
                        }
                    }
                    board [column] [row] = number;
                }
                if (column==2) {//column three
                    int number = random.nextInt(15)+31;
                    for (int r = 0; r<5; r++) {
                        while (board [2] [r] == number) {
                            number = random.nextInt(15)+31;
                        }
                    }
                    board [column] [row] = number;
                }
                if (column==3) { //column 4
                    int number = random.nextInt(15)+46;
                    for (int r = 0; r<5; r++) {
                        while (board [3] [r] == number) {
                            number = random.nextInt(15)+46;
                        }
                    }
                    board [column] [row] = number;
                }
                if (column==4) { //column 5
                    int number = random.nextInt(15)+61;
                    for (int r = 0; r<5; r++) {
                        while (board [4] [r] == number) {
                            number = random.nextInt(15)+61;
                        }
                    }
                    board [column] [row] = number;
                }
            }
        }
    }

    public void DuplicateBoard() //make a duplicate board to keep track of matches
    {
        for (int x = 0; x<5; x++) {
            for (int y = 0; y<5; y++) {
                duplicate [x] [y] = 0;
            }
        }
    }

    public void PrintBoard() //print out the board
    {
        System.out.println("\u000cB\tI\tN\tG\tO\t");
        for (int row = 0; row<5; row++) {
            for (int column = 0; column<5; column++) {
                if (board [column] [row] == 0) {          
                    if (column==4) {
                        System.out.println("X \t\n");
                    }
                    else {
                        System.out.print("X \t");
                    }
                }
                else {
                    if (column==4) {
                        System.out.println(board [column] [row]+"\t\n");
                    }
                    else {
                        if (board [column] [row] < 10 && board [column] [row] > 0){
                            System.out.print("0"+board [column] [row]+"\t");
                        }
                        else {
                            System.out.print(board [column] [row]+" \t");
                        }
                    }
                }
            }
        }
    }

    public void MarkSpot () { //take in number, match it and mark
        System.out.println("Please input the number called:");
        int input = scanner.nextInt();
        //for (int x = 0; x<5; x++) {
        // for (int y = 0; y<5; y++) {

        //}
        // }
        for (int x = 0; x<5; x++) {
            for (int y = 0; y<5; y++) {
                if (input == board [y] [x] ) {
                    duplicate [y] [x] = input;
                    board [y] [x] = 0;
                    System.out.println("There was a match! Covered "+input+".");
                }
            }
        }
    }

    public void CheckBingo() { //check for bingos
        if (mode == 0) { //Normal
            for (int x = 0; x<5; x++) {
                if (duplicate [x] [0] != 0 && duplicate [x] [1] != 0 && duplicate [x] [2] != 0 && duplicate [x] [3] != 0 && duplicate [x] [4] != 0 ) {
                    System.out.println("\nBINGO\nThe winning numbers are: "+duplicate[x][0]+" "+duplicate[x][1]+" "+duplicate[x][2]+" "+duplicate[x][3]+" "+duplicate[x][4]);
                    bingo = true;
                }
                if (duplicate [0] [x] != 0 && duplicate [1] [x] != 0 && duplicate [2] [x] != 0 && duplicate [3] [x] != 0 && duplicate [4] [x] != 0 ) {
                    System.out.println("\nBINGO\nThe winning numbers are: "+duplicate[0][x]+" "+duplicate[1][x]+" "+duplicate[2][x]+" "+duplicate[3][x]+" "+duplicate[4][x]);
                    bingo = true;
                }
            }
            if (duplicate [0] [0] != 0 && duplicate [1] [1] != 0 && duplicate [2] [2] != 0 && duplicate [3] [3] != 0 && duplicate [4] [4] != 0 ) {
                System.out.println("\nBINGO\nThe winning numbers are: "+duplicate[0][0]+" "+duplicate[1][1]+" "+duplicate[2][2]+" "+duplicate[3][3]+" "+duplicate[4][4]);
                bingo = true;
            }
            if (duplicate [4] [0] != 0 && duplicate [3] [1] != 0 && duplicate [2] [2] != 0 && duplicate [1] [3] != 0 && duplicate [0] [4] != 0  ) {
                System.out.println("\nBINGO\nThe winning numbers are:"+duplicate[4][0]+" "+duplicate[3][1]+" "+duplicate[2][2]+" "+duplicate[1][3]+" "+duplicate[0][4]);
                bingo = true;
            }
        }
        if (mode == 1) {//Postage Stamp
            if (duplicate [1] [4] != 0 && duplicate [1] [3] != 0 && duplicate [0] [4] != 0 && duplicate [0] [3] != 0 ) {
                System.out.println("\nBINGO (postage stamp)\nThe winning numbers are: "+duplicate[1][4]+" "+duplicate[1][3]+" "+duplicate[0][4]+" "+duplicate[0][3]);
                bingo = true;
            }
        }
        if (mode == 2) {//Borders
            if (duplicate [0] [0] != 0 && duplicate [1] [0] != 0 && duplicate [2] [0] != 0 && duplicate [3] [0] != 0 && duplicate [4] [0] != 0&& duplicate [4] [4] != 0&& duplicate [4] [3] != 0&& duplicate [4] [2] != 0&& duplicate [4] [1] != 0&& duplicate [0] [1] != 0&& duplicate [0] [2] != 0&& duplicate [0] [3] != 0&& duplicate [0] [4] != 0&& duplicate [1] [4] != 0&& duplicate [2] [4] != 0&& duplicate [3] [4] != 0){
                System.out.println("\nBINGO (border) \nThe winning numbers are: "+duplicate[0][0]+" "+duplicate[1][0]+" "+duplicate[2][0]+" "+duplicate[3][0]+" "+duplicate[4][0]+" "+duplicate[0][4]+" "+duplicate[1][4]+" "+duplicate[2][4]+" "+duplicate[3][4]+" "+duplicate[4][4]+" "+duplicate[4][1]+" "+duplicate[4][2]+" "+duplicate[4][3]+" "+duplicate[0][1]+" "+duplicate[0][2]+" "+duplicate[0][3]);
                bingo = true;
            }
        }
        if (mode == 3) {//X
            if (duplicate [4] [0] != 0 && duplicate [3] [1] != 0 && duplicate [2] [2] != 0 && duplicate [1] [3] != 0 && duplicate [0] [4] != 0&&duplicate [0] [0] != 0 && duplicate [1] [1] != 0 && duplicate [2] [2] != 0 && duplicate [3] [3] != 0 && duplicate [4] [4] != 0){
                System.out.println("\nBINGO (X)\nThe winning numbers are: "+duplicate[0][0]+" "+duplicate[1][1]+" "+duplicate[2][2]+" "+duplicate[3][3]+" "+duplicate[4][4]+" "+duplicate[4][0]+" "+duplicate[3][1]+" "+duplicate[2][2]+" "+duplicate[1][3]+" "+duplicate[0][4]);
                bingo = true;
            }
        }
        if (mode == 4) {//Fill Board
            int count = 0;
            for (int x = 0; x<5; x++) {
                for (int y = 0; y<5; y++) {
                    if (duplicate [x] [y] != 0) {
                        count++;
                    }
                }
            }
            if (count == 25) {
                System.out.println("\nBINGO (fill board)");
                bingo = true;
            }
        }
        if (bingo == true) { //play again
            System.out.println("Would you like to play again? [y/n]");
            String reply;
            reply = scanner.nextLine();
            while (!(reply.equals("y") || reply.equals("n"))) { //error handling
                System.out.println("Please input 'y' or 'n'.");
                reply = scanner.nextLine();
            }
            if (reply.equals("y")) {
                Play();
            }
        }
    }
}
