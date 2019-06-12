import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="SWINGAPP" height="300" width="300"></applet>
*/

public class SWINGAPP extends JApplet implements ActionListener
{
	JLabel n1=new JLabel("Number 1: ");
	JLabel n2=new JLabel("Number 2: ");
	
	JTextField no1=new JTextField(10);
	JTextField no2=new JTextField(10);
	
	JCheckBox n1C=new JCheckBox("N1");
	JCheckBox n2C=new JCheckBox("N2");
	
	ButtonGroup opr=new ButtonGroup();
	JRadioButton addR=new JRadioButton("Addition");
	JRadioButton subR=new JRadioButton("Subtraction");
	
	JButton calc=new JButton("Calculate");
	
	JComboBox jcb=new JComboBox();
	
	Icon tick=new ImageIcon("tick.png");
	Icon cross=new ImageIcon("cross.png");
	Icon plus=new ImageIcon("plus.png");
	Icon minus=new ImageIcon("minus.png");
	
	public void init() 
	{
		setLayout(new FlowLayout());
		add(n1);
		add(no1);
		add(n1C);
		n1.setIcon(tick);
		addR.setIcon(plus);
		
		add(n2);
		add(no2);
		add(n2C);
		n2.setIcon(cross);
		subR.setIcon(minus);
		
		add(addR);
		opr.add(addR);
		add(subR);
		opr.add(subR);
		
		jcb.addItem("CheckBox Item 1");
		jcb.addItem("CheckBox Item 2");
		jcb.addItem("CheckBox Item 3");
		jcb.setEditable(false);
		jcb.setSelectedItem("Item 2");
		jcb.setMaximumRowCount(4);
		add(jcb);
		
		add(calc);
		
		calc.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Integer n1=Integer.parseInt(no1.getText());
		Integer n2=Integer.parseInt(no2.getText());
		String s="";
		if(addR.isSelected()==true)
		{
			s=String.valueOf(n1.intValue()+n2.intValue());
		}
		else if(subR.isSelected()==true)
		{
			s=String.valueOf(n1.intValue()-n2.intValue());
		}
		showStatus(s);
	}
}