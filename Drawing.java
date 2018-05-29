
import java.awt.*;
import javax.swing.*;

/**
 * Class Snapple_Wapple - the purpose of this program is to paint
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Drawing extends JApplet
{
    
    private int x;
    
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
     g.setColor (Color.magenta); //black, blue, cyan, gray, darkGray, lightGray,
                                 //green, magenta, orange, pink, red, white, yellow   
     g.fillOval(100,200,100,100);
     g.drawRect(100,200,100,100);
     g.drawString("Hello", 50, 50);
     g.drawArc(60,60,60,60,60,60);
     int [] xcoordinates = {10, 20, 30, 40};
     int [] ycoordinates = {40, 30, 20, 10};

     g.drawPolygon(xcoordinates, ycoordinates, 4);
     
    }

}
