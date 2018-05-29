import java.awt.*;
import javax.swing.*;
public class Draw_Fibonacci extends JApplet
{    
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        for (int j = 1; j<= 15; j++) {
            int no = fibonacci(j)*10;
            if (j == 1) {
                g.drawRect(0, 0, no, no);
            } else if(j==2) {
                g.drawRect(fibonacci(j-1)*10, 0, no, no);
            } else if (j % 2 == 0) {
                g.drawRect(fibonacci(j-1)*10, 0, no, no);
            } else if (j % 2 == 1) {
                g.drawRect(0, fibonacci(j-1)*10, no, no);
            }
        }   
    }

    public static int fibonacci (int n) {
        if (n <= 2) {
            return 1;
        } else {
            int x = fibonacci(n-1) + fibonacci(n-2);
            return x;
        }
    }
}
