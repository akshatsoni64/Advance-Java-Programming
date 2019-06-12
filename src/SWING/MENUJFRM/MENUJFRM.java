import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MENUJFRM extends JFrame implements ActionListener
{
	Icon plus=new ImageIcon("plus.png");
	Icon minus=new ImageIcon("minus.png");
	Icon tick=new ImageIcon("tick.png");
	Icon cross=new ImageIcon("cross.png");
	
	JMenuBar mb=new JMenuBar();
	JMenu m=new JMenu("Icon");
	JMenu m2=new JMenu("Select"); 
	JMenuItem mi1=new JMenuItem("MenuItem 1");
	JMenuItem mi2=new JMenuItem("MenuItem 2");
	JMenuItem mi3=new JMenuItem("MenuItem 3");
	JMenuItem mi4=new JMenuItem("MenuItem 4");
	
	JRadioButtonMenuItem jrbmi1=new JRadioButtonMenuItem("RadioButton 1");
	JRadioButtonMenuItem jrbmi2=new JRadioButtonMenuItem("RadioButton 2");
	ButtonGroup bg=new ButtonGroup();
	
	JCheckBoxMenuItem jcbmi1=new JCheckBoxMenuItem("CheckBox 1");
	JCheckBoxMenuItem jcbmi2=new JCheckBoxMenuItem("CheckBox 2");
	
	public MENUJFRM()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		
		setSize(250,250);
		setLayout(new FlowLayout());
		
		setJMenuBar(mb);
		mb.add(m);
		mb.add(m2);
		
		m.add(mi1);
		mi1.setIcon(tick);
		mi1.addActionListener(this);
		
		m.add(mi2);
		mi2.setIcon(cross);
		mi2.addActionListener(this);
		
		m.addSeparator();
		
		m.add(mi3);
		mi3.setIcon(plus);
		mi3.addActionListener(this);
		
		m.add(mi4);
		mi4.setIcon(minus);
		mi4.addActionListener(this);
		
		m2.add(jrbmi1);
		jrbmi1.addActionListener(this);
		
		m2.add(jrbmi2);
		jrbmi2.addActionListener(this);
		
		m2.addSeparator();
		
		bg.add(jrbmi1);
		bg.add(jrbmi2);
		
		m2.add(jcbmi1);
		jcbmi1.addActionListener(this);
		
		m2.add(jcbmi2);
		jcbmi2.addActionListener(this);

		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{		
		System.out.println(ae.getActionCommand());		
	}
	
	public static void main(String args[])
	{
		new MENUJFRM();
	}
}