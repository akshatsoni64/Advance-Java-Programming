//Practical 4:Develop an applet that display the position of the mouse at the upper left corner of the applet when it is dragged or moved. Draw a 10x10 pixel rectangle filed with black at the current mouse position

/*
	<applet code="POSRECT" height="400" width="600"></applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class POSRECT extends Applet implements MouseMotionListener
{
	int x,y;
	
	public void init()
	{
		addMouseMotionListener(this);
	}
	
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(String.valueOf(x),10,10);
		g.drawString(String.valueOf(y),35,10);
		
		g.fillRect(x,y,10,10);
	}
}