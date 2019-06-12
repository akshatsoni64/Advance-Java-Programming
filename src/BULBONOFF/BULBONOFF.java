 //Practical 5.Program 3: Develop an applet that displays image of bulb and label for state of the bulb(ON/OFF).
 
 /*
	<applet code="BULBONOFF" height="400" width="400"></applet>
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BULBONOFF extends Applet implements ActionListener
{
	Button b;
 	Image pic;
	public void init()
	{
		b = new Button("ON");
		b.setPreferredSize(new Dimension(80, 50));
		add(b);
		b.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawImage(pic,100,100,this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = b.getLabel();
		if(s=="ON")
		{
			b.setLabel("OFF");
			pic =getImage(getDocumentBase(),"on.jpg");
			repaint();
		}
		else if(s=="OFF")
		{
			b.setLabel("ON");
			pic =getImage(getDocumentBase(),"off.jpg");
			repaint();
		}  
	}  	
}