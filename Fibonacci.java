import java.util.*;
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    static Scanner scan = new Scanner(System.in);    
    public static void main () {
        System.out.println("Enter number of terms you want");
        double number = scan.nextInt();
        for (double j = 1.0; j<= number; j++) {
            double no = fibonacci(j);
            System.out.println(no);
        }
        System.out.println("\nDONE");
    }

    public static double fibonacci (double n) {
        if (n <= 2.0) {
            return 1.0;
        } else {
            double x = fibonacci(n-1.0) + fibonacci(n-2.0);
            return x;
        }
    }
}
