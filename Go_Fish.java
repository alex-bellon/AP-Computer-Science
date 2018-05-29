/*
 * Alex Bellon
 * The purpose of this program is to play go fish
 * v1.0
 * nov 20 2014
 */

import java.util.*;
public class Go_Fish
{
    int usersize = 0;
    int compsize = 0;
    int userp = 0;
    int ucomp = 0;
    Deck gofish = new Deck();
    Cards[] comp  = new Cards [13];
    Cards[] user = new Cards [13];
    Scanner scan = new Scanner(System.in);

    public void Go_Fish() //play the game
    {
        Play();
    }

    public void Play() //new game
    {
        gofish = new Deck();
        comp = new Cards [13];
        user  = new Cards [13];
        usersize = 0;
        compsize = 0;
        userp = 0;
        ucomp = 0;
        DealHand();
        CheckMatches();
        SortCards();
        TellCards();
        while ((usersize >0) || (compsize > 0 )) { // taking turns until both people have zero cards
            UserTakeATurn();
            SortCards();
            CheckMatches();
            FillHand();
            CompTakeATurn();
            SortCards();
            CheckMatches();
            FillHand();
            TellCards();
            if (gofish.CardsLeft()==0) {
                DeclareWinner();
            }
        }        
    }

    public void DealHand() //deal cards to user and computer
    {
        gofish.Shuffle();
        System.out.println("Welcome to Go Fish!");
        for (int x=0;x<7;x++) { //deal to user
            user [x] = gofish.DealCard();
            usersize++;
        }
        for (int x=0;x<7;x++) { //deal to computer
            comp [x] = gofish.DealCard();
            compsize++;
        }
    }

    public void TellCards() //read out the cards to the user
    {
        System.out.println("\nYour cards are:");
        for (int x=0;x<13;x++) {
            if (!(user[x]==null)){ //only print out not nulls
                System.out.println("["+x+"]:"+user[x].toString());
            }
        }
        System.out.println("\nYour opponent's cards are:");
        for (int x=0;x<13;x++) {
            if (!(comp[x]==null)){
                System.out.println("["+x+"]:"+comp[x].toString());
            }    
        }
    }

    public void UserTakeATurn() { //the user takes a turn and asks for the cards
        int input = 0;
        int a = 0;
        int compnumber = 0;
        int number;
        boolean notthere = false;
        System.out.println("\nWhat card would you like to ask for?\nPlease input the number in the brackets that corresponds to the card.");
        input = scan.nextInt();        
        while (user[input]==null) { //error handling
            System.out.println("There isn't a card in that position. Please try again.");
            input = scan.nextInt();
        }
        number = user[input].getValue();
        for (int x=0;x<13;x++) { //go through and check for matches
            if (!(comp[x]==null)) {
                compnumber = comp[x].getValue();
            }
            if (compnumber == number) { //if there is a match
                comp [x] = null;
                user [input] = null;
                System.out.println("There was a match! You got "+number+"s and they were discarded into the pile.");
                userp++;
                notthere = false; 
                x = 13;
                usersize--;
            }
            else if (!(compnumber == number)) {
                notthere = true;
            }
        }
        if (notthere == true) { //no matches
            System.out.println("There weren't any matches. You draw a new card from the pile.");
            String reply;   
            int y = 0;
            for (int x=0;x<13;x++) { //go through and check for matches}
                if (user [x] == null) { //if there is a match
                    user [x] = gofish.DealCard();
                    y = x;
                    x=13;
                }
            }
            usersize++;
            System.out.println("You drew a "+user [y].toString()+". Would you like your cards read out to you? [y/n]");
            reply = scan.nextLine();
            while (!(reply.equals("y") || reply.equals("n"))) { // error handling
                System.out.println("Please input 'y' or 'n'.");
                reply = scan.nextLine();
            }
            if (reply.equals("y")) {
                TellCards();
            }
        }              
    }

    public void CompTakeATurn() { //computer takes turn
        int a = 0;
        int compnumber = 0;
        int usernumber = 0;
        int number = 0;
        boolean notthere = false;
        Random random = new Random();
        compnumber = random.nextInt(13);
        while (comp [compnumber] == null) {
            compnumber = random.nextInt(13);
        }
        System.out.println("\nThe computer is taking it's turn...");
        for (int x=0;x<13;x++) { //go through and check for matches
            if (!(user[x]==null)) {
                usernumber = user[x].getValue();
            }
            if (comp[compnumber].getValue() == usernumber) {
                number = comp[compnumber].getValue();
                comp [compnumber] = null;
                user [x] = null;
                System.out.println("There was a match! The computer got "+number+"s and they were discarded into the pile.");
                ucomp++;
                notthere = false; 
                x = 13;        
                compsize--;
            }
            else if (!(compnumber == usernumber)) {
                notthere = true;
            }
        }
        if (notthere == true) {
            System.out.println("There weren't any matches. The computer drew a new card from the pile.");
            int y = 0;
            for (int x=0; x<13; x++){
                if (comp [x] == null) {
                    y = x;
                }
            }
            comp [y] = gofish.DealCard();  
            compsize++;
        }              
    }

    public void CheckMatches() { //after turns and dealing, check for any preliminary matches
        for (int x=0;x<13;x++) { //user checking
            for (int y=x+1;y<13;y++) {
                if (!((user[x]==null) || (user[y]==null))){
                    if (user[x].getValue()== user[y].getValue()){
                        user [x] = null;
                        user [y] = null;
                        System.out.println("\nThere was a match! They were taken out of your deck.");
                        userp++;
                        usersize=usersize-2;
                    }
                }
            }
        }
        for (int x=0;x<13;x++) { //computer checking
            for (int y=x+1;y<13;y++) {
                if (!((comp[x]==null) || (comp[y]==null))){
                    if (comp[x].getValue()== comp[y].getValue()){
                        comp [x] = null;
                        comp [y] = null;
                        System.out.println("\nThere was a match! They were taken out of the computer's deck.");
                        ucomp++;
                        compsize=compsize-2;
                    }
                }
            }
        }
    }

    public void FillHand() {//make sure there are cards
        boolean uempty = true;
        boolean cempty = true;
        for (int x=0; x<13;x++) {
            if (!(user [x]==null)){
                uempty = false;
            }
        }
        for (int x=0; x<13;x++) {
            if (!(comp [x]==null)){
                cempty = false;
            }
        }
        if (gofish.CardsLeft()>0){
            if (uempty == true) { //if hand is empty, add a card
                user[0]= gofish.DealCard();
            }
            if (cempty==true) { //if hand is empty, add a card
                comp[0]= gofish.DealCard();
            }
        }
    }

    public void SortCards() {
        for (int x=0; x<13; x++) {
            for (int y=x+1;y<13; y++) {
                if (user [x] == null) {
                    Cards temp;
                    temp = user [x];
                    user [x] = user [y];
                    user[y] = temp;
                }
            }
        }
        for (int x=0; x<13; x++) {
            for (int y=x+1;y<13; y++) {
                if (comp [x] == null) {
                    Cards temp;
                    temp = comp [x];
                    comp [x] = comp [y];
                    comp[y] = temp;
                }
            }
        }
    }

    public void DeclareWinner() { //figure out the winner
        if (userp > ucomp) { //user wins
            System.out.println("You won! You had "+userp+" points and the computer had "+ucomp+" points.");
        }
        else if (ucomp > userp) { //comp wins
            System.out.println("You lost! You had "+userp+" points and the computer had "+ucomp+" points.");
        }
        System.out.println("Would you like to play again? [y/n]");
        String reply;
        reply = scan.nextLine();
        while (!(reply.equals("y") || reply.equals("n"))) { //error handling
            System.out.println("Please input 'y' or 'n'.");
            reply = scan.nextLine();
        }
        if (reply.equals("y")) {
            Play();
        }
    }
}
