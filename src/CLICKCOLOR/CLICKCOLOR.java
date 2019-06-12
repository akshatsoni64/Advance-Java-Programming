/*Practical 7: Develop a program that has only one button in the frame, clicking on the button cycles through the colors: red->green->blue and so on. One color changes per click.(use getBackGround() method to get the current color)*/

 /*
	<applet code="CLICKCOLOR" height="600" width="600"></applet>
 */
 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CLICKCOLOR extends Frame implements ActionListener
{
	Button b=new Button("Change Background");
	
	public CLICKCOLOR()
	{
		setSize(600,600);
		setTitle("BackGround");
		setLayout(new FlowLayout());
		setBackground(Color.red);
		setVisible(true);
			
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
	
	public static void main(String args[])
	{
		CLICKCOLOR cc=new CLICKCOLOR();
	}
}