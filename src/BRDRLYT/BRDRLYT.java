import java.awt.*;
import java.awt.event.*;

public class BRDRLYT extends Frame  
{
	Button b1=new Button("Button 1");
	Button b2=new Button("Button 2");
	Panel b3=new Panel();
	Button b4=new Button("Button 4");
	Button b5=new Button("Button 5");
	Button b11=new Button("Button");
	Button b12=new Button("Buttonb");
		
	public BRDRLYT()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		setSize(300,300);
		setLayout(new BorderLayout());
		
		add(b1,BorderLayout.NORTH);		
		add(b2,BorderLayout.SOUTH);
				
		b3.setLayout(new BorderLayout());
		b3.add(b11,BorderLayout.EAST);		
		b3.add(b12,BorderLayout.WEST);		
		add(b3,BorderLayout.CENTER);
		
		add(b4,BorderLayout.EAST);		
		add(b5,BorderLayout.WEST);
		
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new BRDRLYT();
	}
}