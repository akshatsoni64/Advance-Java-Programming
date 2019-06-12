//Practical 5.Program 1: Develop an applet that contains one button. Initialize the label on the button to 'start', when the user presses the button, which changes the label between these two values each time the button is pressed

/*
	<applet code="BTNSTART" height="400" width="400"></applet>
*/
 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BTNSTART extends Applet implements ActionListener
{
	Button b=new Button("Start");
	public BTNSTART()
	{
		Dimension d=new Dimension(100,70);
		Font f = new Font("Times New Roman", Font.PLAIN,24);
		add(b);
		b.setFont(f);
		b.setPreferredSize(d); 
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String S=b.getLabel();
		if(S=="Start")
		{
			b.setLabel("Stop");
		}
		else
		{
			b.setLabel("Start");
		}
	}
}