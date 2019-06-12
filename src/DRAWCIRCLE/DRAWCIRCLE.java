/*Practical 1.Program 2: Develop an applet that draws a circle. The dimension of the applet should be 500 x 300 pixels. The circle should be centered in the applet and have a radius of 100 pixels. Display your name centered in a circle.( using drawOval()
method).*/

/*
	<applet code="DRAWCIRCLE" height="300" width="300"></applet>
*/

import java.applet.*;
import java.awt.*;

public class DRAWCIRCLE extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Niraj Thumar",115,150);
		g.drawOval(50,50,200,200);
	}
}