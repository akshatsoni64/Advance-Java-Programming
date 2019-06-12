//Practical 3: Built an applet that displays a horizontal rectangle in its center, Let the rectangle fill with color from left to right.

/*
	<applet code="SHADERECT" height="320" width="450"></applet>
*/

import java.applet.*;
import java.awt.*;

public class SHADERECT extends Applet
{
	public void paint(Graphics g)
	{
		int w=63,h=175;
		int x=74,y=74;
		
		g.setColor(Color.black);
		g.drawRect(x,y,w+1,h+1);
		g.setColor(Color.white);
		g.fillRect(x+1,y+1,w,h);
		
		x=x+60;
		g.setColor(Color.black);
		g.drawRect(x,y,w+1,h+1);
		g.setColor(Color.lightGray);
		g.fillRect(x+1,y+1,w,h);
		
		x=x+60;
		g.setColor(Color.black);
		g.drawRect(x,y,w+1,h+1);
		g.setColor(Color.gray);
		g.fillRect(x+1,y+1,w,h);
		
		x=x+60;
		g.setColor(Color.black);
		g.drawRect(x,y,w+1,h+1);
		g.setColor(Color.darkGray);
		g.fillRect(x+1,y+1,w,h);
		
		x=x+60;
		g.setColor(Color.black);
		g.drawRect(x,y,w+1,h+1);
		g.setColor(Color.black);
		g.fillRect(x+1,y+1,w,h);
	}	
}