//Develop an applet to demonstrate use of <param> tag.

/*
	<applet code="PARAMMSG" height="400" width="400">
		<param name="MSG" value="Hello World">
	</applet>
*/

import java.applet.*;
import java.awt.*;

public class PARAMMSG extends Applet
{
	public void paint(Graphics g)
	{
		String msg=getParameter("MSG");
		
		g.drawString(msg,50,50);
	}
}