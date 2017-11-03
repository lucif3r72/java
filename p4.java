import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class p4 extends Applet 
{
public void paint(Graphics g)
{
g.setColor(Color.cyan);
g.fillOval(40, 80, 150, 100);
g.setColor(Color.BLUE);
g.drawRoundRect(200, 80, 160, 100, 20, 20);
}
}
