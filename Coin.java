import java.util.*;
/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin
{
    Random random = new Random ();
    final int heads = 1;
    final int tails = 0;
    int face;

    public Coin()
    {
       
    }

    public void flip()
    {
        face = random.nextInt(2);
    }

    public String toString()
    {
        if (face == 1)
            return "Heads";
        else
            return "Tails";
    }
}
