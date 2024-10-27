// Aim: Write a program to display circle and filled circle using Applet. 
// Name: Khan Maaroof Nahid
// UIN: 231P059
import java.awt.*;
import java.applet.*;

/* 
   <applet code="Circle.class" width=300 height=200> 
   </applet> 
*/ 

public class Circle extends Applet {
    public void paint(Graphics g) {
        // Normal Circle
        g.setColor(Color.BLACK);
        g.drawOval(50, 50, 100, 100); // x, y, width, height
        g.drawString("Normal Circle", 70, 45);
        
        // Filled Circle
        g.setColor(Color.BLUE);
        g.fillOval(180, 50, 100, 100); // x, y, width, height
        g.setColor(Color.BLACK);
        g.drawString("Filled Circle", 200, 45);
}
}
