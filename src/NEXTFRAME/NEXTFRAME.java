 //Practical 5.Program 2: Develop an Applet using Frame that opens another Frame on button click

import java.awt.*;
import java.awt.event.*;

public class NEXTFRAME implements ActionListener
{
	Frame f1=new Frame();
	Frame f2=new Frame();
	Button b1=new Button("Show");
	Button b2=new Button("Close");
	
	public static void main(String args[])
	{
		NEXTFRAME nf=new NEXTFRAME();
	}
	
	public NEXTFRAME()
	{
		f1.add(b1);
		f2.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				f2.dispose();
				b1.setLabel("Show");
			}
		});
		
		f1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent)
			{
				System.exit(0);
			}        
		});
		
		f1.setSize(300,300);
		f1.setTitle("Frame1");
		f1.setVisible(true);
		
		f2.setSize(150,150);
		f2.setTitle("Frame2");
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			f2.setVisible(true);
			boolean bool=f2.isShowing();
			if(bool==true)
			{
				b1.setLabel("Hide");
				f2.setVisible(true);
			}
			else
			{
				b1.setLabel("Show");
			}
		}
	}
}