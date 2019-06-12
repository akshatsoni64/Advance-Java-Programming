import java.awt.*;
import java.applet.*;

/*
	<applet code="CANVASEX" height="300" width="300"></applet>
*/

public class CANVASEX extends Applet
{
	Canvas c=new Canvas();
	Image i;
	public void init()
	{
		i=getImage(getDocumentBase(),"plus.png");
		c.setBackground(Color.RED);
		c.setSize(50,50);
		add(c);
	}
	
	public void paint(Graphics g)
	{
		c.getGraphics().drawImage(i,13,13,this);
		g.setColor(Color.YELLOW);
		g.drawLine(5,30,35,30);
	}
}