//Practical 6: Develop an applet that uses the mouse listener, which overrides only two methods which are mousePressed and mouseReleased

/*
	<applet code="MOUSERP" height="400" width="400"></applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MOUSERP extends Applet implements MouseListener
{
	int x,y;
	String msg;
	
	public MOUSERP()
	{
		addMouseListener(this);
	}
	
	public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="MousePressed";
		repaint();
	}
	
	public void mouseReleased(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="MouseReleased";
		repaint();
	}
		
	public void paint(Graphics g)
	{
		MOUSERP mrp=new MOUSERP();
		
		Font f=new Font("Britannic Bold",Font.PLAIN,24);
		g.setFont(f);
		g.drawString(String.valueOf(x)+","+String.valueOf(y),10,20);
		
		g.drawString(msg,x,y);
	}
	
	//Extended from here to change the BGCOLOR on mouse entering and exit
	
	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.red);
	}
	
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.green);
	}
	
	public void mouseClicked(MouseEvent me){}
}