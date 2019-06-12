/*Practical 8: Develop an program that contains three check boxes and 30 x 30 pixel canvas.The three checkboxes should be labeled Red, Green,Blue. The selection of the check boxes determine the color of the canvas. For example, if the user selects both Red and Blue, the canvas should be purple*/

/*
	<applet code="CHECKCOLOR2" height="60" width="500"></applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CHECKCOLOR2 extends Applet implements ItemListener
{
	Canvas c=new Canvas();
	Checkbox ch1=new Checkbox("RED");
	Checkbox ch2=new Checkbox("GREEN");
	Checkbox ch3=new Checkbox("BLUE");
	
	public void init()
	{
		add(c);
		add(ch1);
		add(ch2);
		add(ch3);
		
		c.setSize(30,30);
		c.setBackground(Color.black);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ch1.getState()==true && ch2.getState()==false && ch3.getState()==false)
		{
			c.setBackground(new Color(255,0,0));
		}
		else if(ch1.getState()==false && ch2.getState()==true && ch3.getState()==false)
		{
			c.setBackground(new Color(0,255,0));
		}
		else if(ch1.getState()==false && ch2.getState()==false && ch3.getState()==true)
		{
			c.setBackground(new Color(0,0,255));
		}
		else if(ch1.getState()==true && ch2.getState()==true && ch3.getState()==false)
		{
			c.setBackground(new Color(255,255,0));
		}
		else if(ch1.getState()==false && ch2.getState()==true && ch3.getState()==true)
		{
			c.setBackground(new Color(0,255,255));
		}
		else if(ch1.getState()==true && ch2.getState()==false && ch3.getState()==true)
		{
			c.setBackground(new Color(255,0,255));
		}
		else
		{
			c.setBackground(new Color(0,0,0));
		}
	}
}