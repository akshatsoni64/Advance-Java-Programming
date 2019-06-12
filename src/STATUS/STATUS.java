import java.applet.*;
import java.awt.*;

/*
	<applet code="STATUS" height="400" width="400"></applet>
*/

public class STATUS extends Applet
{
	public void init()
	{
		System.out.println("INIT");
	}
	
	public void start()
	{
		System.out.println("START");
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.BLUE);
		setForeground(Color.RED);
		g.drawString("TEXT",20,10);
		g.drawOval(20,20,40,40);
		System.out.println("PAINT");
	}
	
	public void stop()
	{
		System.out.println("STOP");
	}
	
	public void destroy()
	{
		System.out.println("DESTROY");
	}
}