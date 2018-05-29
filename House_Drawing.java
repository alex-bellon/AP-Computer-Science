
import java.awt.*;
import javax.swing.*;

/**
 * Class our_house - the purpose of this program is to draw a house
 * Alex Bellon
 * Sep 3 2014
 */
public class House_Drawing extends JApplet
{
    // instance variables - replace the example below with your own
    private int x;
    
    public void paint(Graphics g)
    {
        //(across, down, width, height)
        //sky background
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 500, 500);
        //grass
        g.setColor(Color.green);
        g.fillRect(0, 450, 500, 50);
        //wall shadow
        g.setColor(Color.gray);
        g.fillRect (95, 195, 300, 280);
        //walls
        g.setColor(Color.lightGray);
        g.fillRect (100, 200, 300, 280);
        //brick lines horizontal
        g.setColor(Color.white);
        g.drawLine(100, 200, 400, 200);
        g.drawLine(100, 210, 400, 210);
        g.drawLine(100, 220, 400, 220);
        g.drawLine(100, 230, 400, 230);
        g.drawLine(100, 240, 400, 240);
        g.drawLine(100, 250, 400, 250);
        g.drawLine(100, 260, 400, 260);
        g.drawLine(100, 270, 400, 270);
        g.drawLine(100, 280, 400, 280);
        g.drawLine(100, 290, 400, 290);
        g.drawLine(100, 300, 400, 300);
        g.drawLine(100, 310, 400, 310);
        g.drawLine(100, 320, 400, 320);
        g.drawLine(100, 330, 400, 330);
        g.drawLine(100, 340, 400, 340);
        g.drawLine(100, 350, 400, 350);
        g.drawLine(100, 360, 400, 360);
        g.drawLine(100, 370, 400, 370);
        g.drawLine(100, 380, 400, 380);
        g.drawLine(100, 390, 400, 390);
        g.drawLine(100, 400, 400, 400);
        g.drawLine(100, 410, 400, 410);
        g.drawLine(100, 420, 400, 420);
        g.drawLine(100, 430, 400, 430);
        g.drawLine(100, 440, 400, 440);
        g.drawLine(100, 450, 400, 450);
        g.drawLine(100, 460, 400, 460);
        g.drawLine(100, 470, 400, 470);
        g.drawLine(100, 480, 400, 480);
        //roof shadow
        g.setColor(Color.black);
        g.fillRect(45, 170, 400, 25);
        //chimney shadow 1
        g.fillRect(350, 110, 45, 60); 
        //chimney shadow 2
        g.fillRect(330, 100, 80, 20);
        //door
        g.setColor(Color.darkGray);
        g.fillRect(200, 350, 100, 125);
        //roof
        g.fillRect(50, 175, 400, 25);
        //chimney 1
        g.fillRect(355, 115, 45, 60);
        //chimney 2
        g.fillRect(335, 105, 80, 20);
        //door panels
        g.setColor(Color.gray);
        g.fillRect(205, 355, 42, 55);
        g.fillRect(253, 355, 42, 55);
        g.fillRect(205, 415, 42, 55);
        g.fillRect(253, 415, 42, 55);
        //doorknob
        g.setColor(Color.yellow);
        g.fillOval(284, 408, 10, 10);
        //windows
        g.setColor(Color.darkGray);
        g.fillRect(150, 260, 50, 50);
        g.fillRect(300, 260, 50, 50);
        //window panes
        g.setColor(Color.white);
        g.fillRect(155, 265, 40, 40);
        g.fillRect(305, 265, 40, 40);
        //sun ring
        g.setColor(Color.orange);
        g.fillOval(20, 20, 75, 75);
        //sun
        g.setColor(Color.yellow);
        g.fillOval(25, 25, 75, 75);
        //cloud shadow
        g.setColor(Color.lightGray);
        g.fillOval(125, 55, 65, 30);
        g.fillOval(140, 20, 120, 60);
        g.fillOval(215, 55, 40, 30);
        g.fillOval(225, 18, 60, 40);
        //cloud
        g.setColor(Color.white);
        g.fillOval(130, 60, 65, 30);
        g.fillOval(145, 25, 120, 60);
        g.fillOval(220, 60, 40, 30);
        g.fillOval(230, 23, 60, 40);
        //name
        g.drawString("Alex's House", 48, 163);
        
    }

    }


    