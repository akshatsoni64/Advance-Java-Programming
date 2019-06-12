import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="NAMEDIS" height="400" width="400"></applet>
*/

public class NAMEDIS extends Applet implements ActionListener
{
	Frame f=new Frame();
	Label l=new Label("Name: ",Label.CENTER);
	TextField name=new TextField(15);
	Button display=new Button("Display");
	
	public void init()
	{
		f.setSize(300,300);
		f.setTitle("Name : ");
		f.setLayout(new FlowLayout());
		
		add(new Label("Name: "));
		add(name);
		f.add(l);
		add(display);
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				f.dispose();
			}
		});
		
		display.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		l.setText("Name: "+name.getText());
		f.setVisible(true);
	}
}