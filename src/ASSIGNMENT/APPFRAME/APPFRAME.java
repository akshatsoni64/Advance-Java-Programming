import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="APPFRAME" height="600" width="600"></applet>
*/

public class APPFRAME extends Applet
{
	Frame f=new Frame();
	public void init()
	{
		f.setSize(600,600);
		f.setTitle("APPFRAME");
		f.setLayout(new FlowLayout());
		f.add(new Label("Label in Frame"));
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				f.dispose();
			}
		});
		
		f.setVisible(true);
	}
}