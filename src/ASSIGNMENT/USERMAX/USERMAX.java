import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="USERMAX" height="600" width="600"></applet>
*/

public class USERMAX extends Applet implements ActionListener
{
	TextField no1=new TextField(6);
	TextField no2=new TextField(6);
	Label max=new Label("Max: ");
	Button mx=new Button("Max");
	public void init()
	{
		add(new Label("Number 1: "));
		add(no1);
		
		add(new Label("Number 2: "));
		add(no2);
		
		add(max);
		
		add(mx);		
		mx.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Integer i1=Integer.parseInt(no1.getText());
		Integer i2=Integer.parseInt(no2.getText());
		
		int m=(i1>i2)?i1:i2;
		
		max.setText("Max: "+m);
	}
}