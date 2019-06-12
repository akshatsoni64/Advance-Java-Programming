/*Practical 10: Develop a program that draws two sets of ever-decreasing rectangles one in outline form and one filled alternately in black and white*/

/*
	<applet code="BWRECT" height="345" width="475"></applet>
*/
 
import java.applet.*;
import java.awt.*;

public class BWRECT extends Applet
{
	public void paint(Graphics g)
	{
		int x=74,y=74;
		int w=335,h=200;
		
		for(int i=1;i<=8;i++)
		{
			x=x+10;
			y=y+10;
			w=w-20;
			h=h-20;
			if((i%2)==0)
			{
				g.setColor(Color.white);
			}
			else
			{
				g.setColor(Color.black);
			}
			g.fillRect(x,y,w,h);
		}		
	}
}