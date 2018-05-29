import java.util.*;
/**
 Alex Bellon
 October 29 2014
 The purpose of this program is to set up a card to pick
 */
public class Card
{
    Random numberr = new Random(); //number
    Random suitr = new Random(); //suit # representation
    int number;
    int suitnum;
    String suit;

    public void Draw() {
        number = numberr.nextInt(13)+1; //pick random #
        suitnum = suitr.nextInt(4)+1; //pick random suit
    }

    public void convertSuit() { //converting numerical representations of suits to string
        if (suitnum == 1) {
            suit = "Hearts";
        }
        else if (suitnum == 2) {
            suit = "Clubs";
        }
        else if (suitnum == 3) {
            suit = "Spades";
        }
        else if (suitnum == 4) {
            suit = "Diamonds";
        }
    }

    public String pickCard() { //returning the picked card
        return "You picked a "+number+ " of "+suit+".";
    }
}
