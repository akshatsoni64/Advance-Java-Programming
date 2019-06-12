/*Practical 8: Develop an applet that contains three check boxes and 30 x 30 pixel canvas.The three checkboxes should be labeled Red, Green,Blue. The selection of the check boxes determine the color of the canvas. For example, if the user selects both Red and Blue, the canvas should be purple*/

/*
	<applet code="CHECKCOLOR3" height="60" width="500"></applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CHECKCOLOR3 extends Applet implements ItemListener
{
	Canvas c=new Canvas();
	Checkbox ch[]=new Checkbox[3];
	int i=0;
	
	public void init()
	{
		add(c);
		for(i=0;i<3;i++)
		{
			if(i==0)
			{
				ch[i].setLabel("RED");
			}
			else if(i==1)
			{
				ch[i].setLabel("GREEN");
			}
			else if(i==2)
			{
				ch[i].setLabel("BLUE");
			}
			add(ch[i]);
		}
		
		c.setSize(30,30);
		c.setBackground(Color.black);
		for(i=0;i<3;i++)
		{
			ch[i].addItemListener(this);
		}
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ch[i].getState()==true && ch[i++].getState()==false && ch[(i++)++].getState()==false)
		{
			c.setBackground(new Color(255,0,0));
		}
		else if(ch[i].getState()==false && ch[i++].getState()==true && ch[(i++)++].getState()==false)
		{
			c.setBackground(new Color(0,255,0));
		}
		else if(ch[i].getState()==false && ch[i++].getState()==false && ch[(i++)++].getState()==true)
		{
			c.setBackground(new Color(0,0,255));
		}
		else if(ch[i].getState()==true && ch[i++].getState()==true && ch[(i++)++].getState()==false)
		{
			c.setBackground(new Color(255,255,0));
		}
		else if(ch[i].getState()==false && ch[i++].getState()==true && ch[(i++)++].getState()==true)
		{
			c.setBackground(new Color(0,255,255));
		}
		else if(ch[i].getState()==true && ch[i++].getState()==false && ch[(i++)++].getState()==true)
		{
			c.setBackground(new Color(255,0,255));
		}
		else
		{
			c.setBackground(new Color(0,0,0));
		}
	}
}