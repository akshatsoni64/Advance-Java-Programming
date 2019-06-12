//Develop an applet to demonstrate use of MouseMotionListener and MouseListener

/*
	<applet code="MOUSELIS" height="600" width="600"></applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MOUSELIS extends Applet implements MouseMotionListener,MouseListener
{
	int x,y;
	String msg;
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString(Integer.toString(x)+","+Integer.toString(y),10,10);
		g.drawString(msg,10,30);
	}
	
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Dragged";
		repaint();
	}
	
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Moved";
		repaint();
	}
	
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Dragged";
		repaint();}
	
	public void mouseExited(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Exited";
		repaint();
	}
	
	public void mouseEntered(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Entered";
		repaint();
	}
	
	public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Pressed";
		repaint();
	}
	
	public void mouseReleased(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Mouse Released";
		repaint();
	}
}