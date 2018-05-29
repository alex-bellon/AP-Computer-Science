
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cards
{
    public final static int 
    spades = 0, 
    hearts = 1, 
    diamonds = 2,
    clubs = 3;

    public final static int 
    ace = 1,
    jack = 11,
    queen = 12,
    king = 13;

    private int suit;
    private int value;

    public Cards(int theValue, int theSuit) {
        value = theValue;
        suit = theSuit;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuitAsString() {
        if (suit == 0) 
            return ("Spades");
        else if (suit == 1)
            return ("Hearts");
        else if (suit == 2)
            return ("Diamonds");
        else if (suit == 3)
            return ("Clubs");
        else
            return ("???");
    }
    
    public String getValueAsString() {
        if (value == 1)
        return "Ace";
        else if (value == 2)
        return "2";
        else if (value == 3)
        return "3";
        else if (value == 4)
        return "4";
        else if (value == 5)
        return "5";
        else if (value == 6)
        return "6";
        else if (value == 7)
        return "7";
        else if (value == 8)
        return "8";
        else if (value == 9)
        return "9";
        else if (value == 10)
        return "10";
        else if (value == 11)
        return "Jack";
        else if (value == 12)
        return "Queen";
        else if (value == 13)
        return "King";
        else 
        return "???";
    }
    
    public String toString() {
        return getValueAsString() + " of " + getSuitAsString();
    }
}
