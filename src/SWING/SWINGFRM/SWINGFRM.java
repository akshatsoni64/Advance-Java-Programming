import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="SWINGFRM" height="250" width="250"></applet>
*/

public class SWINGFRM extends JFrame implements ActionListener
{
	JLabel n1=new JLabel("Number 1: ");
	JLabel n2=new JLabel("Number 2: ");
	JTextField no1=new JTextField(10);
	JTextField no2=new JTextField(10);
	JButton add=new JButton("Add");
	Icon tick=new ImageIcon("tick.png");
	Icon cross=new ImageIcon("cross.png");
	Icon plus=new ImageIcon("plus.png");
	
	public SWINGFRM()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
				System.out.println("Frame Closed");
			}
		});
		setSize(250,250);
		setLayout(new FlowLayout());
		add(n1);
		add(no1);
		n1.setIcon(tick);
		add(n2);
		add(no2);
		n2.setIcon(cross);
		add(add);
		add.setIcon(plus);
		
		add.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new SWINGFRM();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Integer n1=Integer.parseInt(no1.getText());
		Integer n2=Integer.parseInt(no2.getText());
		int add=n1.intValue()+n2.intValue();
		String s=String.valueOf(add);
		System.out.println(s);
	}
}