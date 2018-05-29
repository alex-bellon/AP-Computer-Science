
/**
 * Write a description of class CoinFlipper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinFlipper
{
    public static void main() {
        int i = 0;
        Coin penny = new Coin();
        while (i<20) {
            System.out.println("The coin is "+ penny.toString() + " up.");
            i++;
        }
    }
}