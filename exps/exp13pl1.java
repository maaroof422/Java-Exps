// Aim: Write an applet to all four types of rectangle (normal rectangle, filled rectangle, round rectangle,
//      round corner rectangle and filled round corner rectangle). 
// Name: Khan Maaroof Nahid
// UIN: 231P059
import java.awt.*;
import java.applet.*;
public class Rectangle extends Applet {
public void paint(Graphics g) {
g.setColor(Color.BLACK);
g.drawRect(20, 30, 100, 50);
        g.drawString("Normal Rectangle", 20, 25);
        g.setColor(Color.BLUE);
        g.fillRect(150, 30, 100, 50);
        g.setColor(Color.BLACK);
        g.drawString("Filled Rectangle", 150, 25);
        g.setColor(Color.RED);
        g.drawRoundRect(20, 100, 100, 50, 20, 20);
        g.drawString("Round Rectangle", 20, 95);
        g.setColor(Color.GREEN);
        g.fillRoundRect(150, 100, 100, 50, 20, 20);
        g.setColor(Color.BLACK);
        g.drawString("Filled Round Corner Rectangle", 150, 95);
    }
}
