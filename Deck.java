import java.util.*;
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck
{
    
    Random random = new Random();
    Cards [] deck = new Cards [52];
    int cardsleft = 52;
    
    public Deck() {
        int cardnum = 0; //array index
        for (int x = 0; x<4; x++){ //suit 
            for (int y = 1; y<14; y++){
                deck[cardnum] = new Cards (y, x);
                cardnum++;
            }
        }
    }
    
    public void Shuffle() {
        int r;
        for (int z = 0; z < 52; z++) {
            r = random.nextInt(52);
            Cards temp;
            temp = deck [z];
            deck [z] = deck [r];
            deck [r] = temp;
        }
    }
    
    public Cards DealCard () {
        cardsleft--;
        return deck [cardsleft];
    }
    
    public int CardsLeft() {
        return cardsleft;
    }    
}
