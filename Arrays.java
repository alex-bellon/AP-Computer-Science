
/**
 * Write a description of class Arrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main() {
        int x;
        int[] numbers = {1,2,3,4,5,};
        x = numbers[3];
        System.out.println(x);
        int[] alsonumbers = new int [5]; //empty array with five spaces
        alsonumbers[0] = 1;
        alsonumbers[1] = 2;
        
        for (int y= 0; y<5; y++) {
            alsonumbers [y] = y+1;
        }
    } 
}
