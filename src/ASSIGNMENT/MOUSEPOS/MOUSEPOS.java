/*
	<applet code="MOUSEPOS" height="400" width="400"></applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MOUSEPOS extends Applet implements MouseMotionListener
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
		Font f=new Font("Britannic Bold",Font.PLAIN,24);
		g.setFont(f);
		g.drawString(String.valueOf(x)+","+String.valueOf(y),10,20);
	}
}