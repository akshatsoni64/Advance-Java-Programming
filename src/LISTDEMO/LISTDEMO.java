import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="LISTDEMO" height="300" width="300"></applet>
*/

public class LISTDEMO extends Applet implements ActionListener
{
	List l=new List(3,false);
	
	public void init()
	{
		l.add("ITEM1");
		l.add("ITEM2");
		l.add("ITEM3");
		l.add("ITEM4");
		add(l);
		l.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		showStatus(l.getSelectedItem());
	}
}