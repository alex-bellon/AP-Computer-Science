import java.util.*;
public class Sum
{
    public static void Sum()
    {
        boolean go = true;
        while (go ==true) {
            Scanner scan= new Scanner(System.in);
            System.out.println("What degree?");
            int num = scan.nextInt();
            System.out.println(sum(num));
        }
    }

    public static int sum(int n)
    {
        if (n==1) {
            return 3;
        } else {
            int sum = 0;
            sum = n + sum(n-1);
            return sum;
        }
    }
}
