//Develop an applet for courier service

import java.awt.*;
import java.awt.event.*;

public class CALCDIST extends Frame implements ActionListener
{
	TextField txtFrom=new TextField(20);
	TextField txtTo=new TextField(20);
	TextField txtWeight=new TextField(20);
	TextField txtDistance=new TextField(20);
	TextField txtAmount=new TextField(20);
	
	Button btnClear=new Button("Clear");
	Button btnCalc=new Button("Calculate");
	
	public CALCDIST()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		setSize(500,200);
		setLayout(new GridLayout(6,2));
		setTitle("CALCDIST");

		add(new Label("From(City) : "));
		add(txtFrom);
		add(new Label("To(City) : "));
		add(txtTo);
		add(new Label("Weight(kg) : "));
		add(txtWeight);
		add(new Label("Distance(km) : "));
		add(txtDistance);
		add(new Label("Amount : "));
		add(txtAmount);
		
		add(btnCalc);
		add(btnClear);
		
		btnClear.addActionListener(this);
		btnCalc.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnClear)
		{
			clear();
		}	
		if(ae.getSource()==btnCalc)
		{
			calc();
		}
	}
	
	public static void main(String args[])
	{
		new CALCDIST();
	}
	
	public void calc()
	{			
		String sDis=txtDistance.getText();
		String sWet=txtWeight.getText();
		
		Integer dis=Integer.valueOf(txtDistance.getText());
		Integer wet=Integer.valueOf(txtWeight.getText());
		
		if(dis>=500)
		{
			if(wet>=100)
			{
				txtAmount.setText(Integer.toString(5*wet));
			}	
			else
			{
				txtAmount.setText(Integer.toString(3*wet));
			}
		}
		else
		{
			if(wet>=100)
			{
				txtAmount.setText(Integer.toString(3*wet));
			}
			else
			{
				txtAmount.setText(Integer.toString(2*wet));
			}
		}
	}
	
	public void clear()
	{
		txtFrom.setText(" ");
		txtTo.setText(" ");
		txtWeight.setText(" ");	
		txtDistance.setText(" ");
		txtAmount.setText(" ");
	}
}