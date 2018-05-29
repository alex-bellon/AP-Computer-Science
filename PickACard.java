
/**
Alex Bellon
Oct 29 2014
The purpose of this program is to pick a card
v1
 */
public class PickACard
{
    public static void main() {
        Card card = new Card(); //new card
        card.Draw(); //draw the numbers
        card.convertSuit(); //convert # to string
        System.out.println(card.pickCard()); //print out card
    }
}
