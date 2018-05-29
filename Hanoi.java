import java.util.*;
/**
 * Write a description of class Hanoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hanoi
{
    static double x =0;
    
    public static void main () {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many discs are there?");
        int d = scan.nextInt();
        move (d, 2,1,3);
        System.out.println("DONE");
    }

    public static void move(int n, int middle, int start, int end) {
        if (n ==1) {
            x++;
            System.out.println(start+" to "+end+" || Move #"+x);
        }
        else {
            move (n-1, end, start, middle);
            x++;
            System.out.println(start+" to "+end+" || Move #"+x);
            move (n-1, start, middle, end);
        }
    }
}
