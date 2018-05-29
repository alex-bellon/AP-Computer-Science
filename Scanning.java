
/**
 * I say hello to the world
 * Alex Bellon
 * 1.0
 */
import java.util.Scanner;

public class Scanning
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);

        int x, y;
        
        System.out.println("\n* * * * *  *\t*   *   * * * * *");
        System.out.println("*\t*  *\t*   *   *\t*");
        System.out.println("*\t*  ******   *   *\t*");
        System.out.println("*\t*  *\t*   *   *\t*");
        System.out.println("* * * * *  *\t*   *   * * * * *\n");
        
        System.out.println("Enter a number");
        x = scan.nextInt();
        System.out.println("Enter another number");
        y = scan.nextInt();
        System.out.println("The sum of your numbers is "+(x+y)+".");
    }
}
