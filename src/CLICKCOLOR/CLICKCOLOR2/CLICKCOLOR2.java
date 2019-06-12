/*Develop a program that has only one button in the applet, clicking on the button cycles through the colors: red->green->blue and so on. One color changes per click.*/

 /*
	<applet code="CLICKCOLOR2" height="600" width="600"></applet>
 */
 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CLICKCOLOR2 extends Applet implements ActionListener
{
	Button b=new Button("Change Background");
	
	public void init()
	{
		setBackground(Color.red);
			
		Font f = new Font("Times New Roman", Font.PLAIN,24);
		Dimension d=new Dimension(400,70);
		
		add(b);
		
		b.setFont(f);
		b.setPreferredSize(d); 
		b.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Color c=getBackground();
		
		if(c==Color.green)
		{
			setBackground(Color.red);	
		}
		else if(c==Color.red)
		{
			setBackground(Color.blue);	
		}
		else if(c==Color.blue)
		{
			setBackground(Color.green);	
		}
	}
}