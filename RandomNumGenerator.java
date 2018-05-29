import java.util.*;
/**
 * Write a description of class RandomNumGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomNumGenerator
{
     public static void main () {
         Random random = new Random();
         int number;
         int i = 1;
         while (i<1001) {
             number = random.nextInt(10);
             if (i%40 == 0) {System.out.println(number);}
             else {System.out.print(number);}
             i++;
            }
        }
}
