//Practical 1.Program 1: Develop an applet that displays Hello inside he applet.



import java.applet.*;
import java.awt.*;

public class HELLO extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("HELLO",50,50);
	}
}
