
/**
 * Write a description of class asdf here.
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Switches
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);

        String input;

        System.out.println("Is the sky blue?");
        input = scan.nextLine();
        if (input.equals("Yes") || input.equals("yes") || input.equals("YES")){
            System.out.println("YOU ARE CORRECT");
        }
        else
        {
            System.out.println("YOU ARE INCORRECT");
        }
       
        double weight;
        double result = 0;
        String planet;
        String resultstr;
        
        System.out.println("How much do you weigh in pounds?");
        weight = scan.nextInt();
        scan.nextLine();
        System.out.println("Which planet do you want to be on (capitalized, please)?");
        planet = scan.nextLine();
        
        switch (planet) {
         case "Mercury": result = ((weight/9.8)*3.7);
         resultstr = String.valueOf(result);
         System.out.print("Your weight on "+ planet + " is " + resultstr + ".");
         break;
         case "Venus": result = ((weight/9.8)*8.8);
         resultstr = String.valueOf(result);
         System.out.print("Your weight on "+ planet + " is " + resultstr + ".");
         break;
         case "Earth": result = weight;
         resultstr = String.valueOf(result);
         System.out.print("Your weight on "+ planet + " is " + resultstr + ".");
         break;
         case "Mars": result = ((weight/9.8)*3.7);
         resultstr = String.valueOf(result);
         System.out.print("Your weight on "+ planet + " is " + resultstr + ".");
         break;
         case "Jupiter": result = ((weight/9.8)*24.8);
         resultstr = String.valueOf(result);
         System.out.print("Your weight on "+ planet + " is " + resultstr + ".");
         break;
         case "Saturn": result = ((weight/9.8)*10.4);
         resultstr = String.valueOf(result);
         System.out.print("Your weight on "+ planet + " is " + resultstr + ".");
         break;
         case "Uranus": result = ((weight/9.8)*8.7);
         resultstr = String.valueOf(result);
         System.out.print("Your weight on "+ planet + " is " + resultstr + ".");
         break;
         case "Neptune": result = ((weight/9.8)*11.2);
         resultstr = String.valueOf(result);
         System.out.print("Your weight on "+ planet + " is " + resultstr + ".");
         break;
         default: System.out.print("That's not a planet!");
         break;
        }
       
    }
}