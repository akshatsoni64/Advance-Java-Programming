import java.awt.*;
import java.awt.event.*;

public class WINFRAME extends Frame
{
	public WINFRAME()
	{
		setSize(600,600);
		setTitle("WINFRAME");
		setLayout(new FlowLayout());
		
		add(new Label("Label",Label.CENTER));
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		
		setVisible(true);
	}
	public static void main(String args[])
	{
		new WINFRAME();
	}
}