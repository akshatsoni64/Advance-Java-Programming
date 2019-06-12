import java.awt.*;
import java.awt.event.*;

public class PANELDEMO extends Panel
{
	Frame f=new Frame();
	public PANELDEMO()
	{
		f.setSize(600,600);
		f.setTitle("Panel Demo");
		f.setBackground(Color.RED);
		f.setLayout(new FlowLayout());
		
		add(new Label("Label in Panel",Label.CENTER));
		f.add(this);
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				f.dispose();
			}
		});
		
		f.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new PANELDEMO();
	}
}