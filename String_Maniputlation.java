/**
 * The purpose of this program is to manipulate a number and make a substring of the input
 * Alex Bellon
 * Ver 1.0 (August 29 2014)
 */
import java.util.Scanner;

public class String_Maniputlation
{
   public static void main ()
   {
      Scanner num = new Scanner(System.in);
       
      double input;
      
      System.out.println("Please enter a number:");
      input = num.nextDouble();
      input = input + 3;
      System.out.println("Your number plus 3 is "+(input)+".");
      input = input - 7;
      System.out.println("Your number minus 7 is "+(input)+".");
      input = input * 2;
      System.out.println("Your number times 2 is "+(input)+".");
      input = input/9;
      System.out.println("Your number divided by 9 is "+(input)+".");
      
      Scanner scan = new Scanner(System.in);
      
      String phrase;
      
      System.out.println("Please enter a phrase that's at least 6 letters long.");
      phrase = scan.nextLine();
      
      while (phrase.length()<6){
          System.out.println("Make sure your phrase is at least six letters long! Try again!");
          phrase = scan.nextLine();
        } 
     
      System.out.println("Your input in all caps is " + phrase.toUpperCase() + ".");  
      System.out.println("Your input in all caps is " + phrase.toLowerCase() + ".");  
      System.out.println("The substring of your input is " + phrase.substring(1,6) + ".");
      
        }
      
    }

