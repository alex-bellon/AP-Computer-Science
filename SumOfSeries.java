import java.util.Scanner;
/**
 * Write a description of class SumOfSeries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumOfSeries
{
    public static void main () {
        for (int w=0; w<100; w++) {
            if (w>0) {
                System.out.println("\n\n");
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number for d");
            int d = scan.nextInt();
            System.out.println("Enter number for a sub 1");
            int a = scan.nextInt();
            System.out.println("Enter number for number of terms");
            int no = scan.nextInt();
            int sum = 0;
            for (int x=1; x<(no+1); x++) {
                int y = a+d*(x-1);
                sum += y;
            }
            System.out.println(sum);
        }
    }
}
