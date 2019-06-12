import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SWINGCOMP extends JFrame
{ 
	JLabel l=new JLabel("Swing Example",JLabel.CENTER);
	JTextField t=new JTextField("JTextField",20);
	JButton b=new JButton("JButton");
	JCheckBox c1=new JCheckBox("Useful");
	JCheckBox c2=new JCheckBox("Not Useful");
	
	public SWINGCOMP()
	{
		setTitle("Swing Example");
		setSize(600,600);
		setLayout(new FlowLayout());
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		
		add(l);
		add(t);
		add(c1);
		add(c2);
		add(b);
		
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new SWINGCOMP();
	}
}