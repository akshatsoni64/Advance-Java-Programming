//Develop an applet to demonstrate the use of <param> tag and calculate volume of sphere

/*
	<applet code="VOLSPHERE" height="300" width="300">
		 <param name="radius" value="3">
	</applet>
*/

import java.applet.*;
import java.awt.*;

public class VOLSPHERE extends Applet
{
	public void paint(Graphics g)
	{
		int r=Integer.parseInt(getParameter("radius"));
		
		double vol=4/3*3.14*(r*r*r);
		
		g.drawString(String.valueOf(vol),30,50);
	}
}