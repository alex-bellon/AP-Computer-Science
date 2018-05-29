
public class Loops
{
    public static void loop() {
        int x = 5;
        do {
          System.out.println("Vikas' IQ is "+x);
          x--;
        }
        while (x>=0);
        
        String message = "*";
        
        for ( int i = 0; i<10 ; i++) {
            System.out.println(message);
            message = message + "*";
        }
    }
}
