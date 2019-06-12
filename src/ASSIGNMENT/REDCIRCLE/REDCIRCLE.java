import java.applet.*;
import java.awt.*;

/*
	<applet code="REDCIRCLE" height="160" width="160"></applet>
*/

public class REDCIRCLE extends Applet
{
	public void init()
	{
		setBackground(Color.YELLOW);
	}
	
	public void paint(Graphics g)
	{
		int x=50,y=50;
		g.setColor(Color.RED);
		g.fillOval(x,y,50,50);
	}
}