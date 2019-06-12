//Practical 2: Draw ten red circles in a vertical column in the center of the applet.

/*
	<applet code="RED10CIRCLE" height="630" width="215"></applet>
*/

import java.applet.*;
import java.awt.*;

public class RED10CIRCLE extends Applet
{
	public void paint(Graphics g)
	{
		int x=90,y=0;
		for(int i=0;i<10;i++)
		{
			y=y+55;
			g.setColor(Color.red);
			g.drawOval(x,y,40,40);
		}
	}
}