import java.awt.*;
import java.awt.event.*;

public class PATTERN extends Frame implements ActionListener
{
	Button gen=new Button("Generate");
	Button clr=new Button("Clear");
	
	TextField chr=new TextField(3);
	TextField stp=new TextField(3);
	
	TextArea text=new TextArea(10,20);
	
	public PATTERN()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		
		setSize(300,300);
		setLayout(new FlowLayout());
		
		add(new Label("Pattern Generator",Label.CENTER));
		add(new Label("Char: ",Label.LEFT));
		add(chr);
		add(new Label("Step: ",Label.RIGHT));
		add(stp);
		add(text);
		add(gen);
		gen.addActionListener(this);
		add(clr);
		clr.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==gen)
		{
			String chrr=chr.getText();
			Integer stpp=Integer.parseInt(stp.getText());
			
			for(int i=0;i<stpp.intValue();i++)
			{
				for(int j=0;j<=i;j++)
				{
					text.append(chrr);
				}
				text.append("\n");
			}
		}
		else if(ae.getSource()==clr)
		{
			text.setText(" ");
		}
	}
	
	public static void main(String args[])
	{
		new PATTERN();
	}
}