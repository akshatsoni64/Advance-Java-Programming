import java.awt.*;
import java.awt.event.*;

public class WINLIS extends Frame implements WindowListener
{
	public WINLIS()
	{
		setSize(300,300);
		setTitle("WindowEvent Demo");
		addWindowListener(this);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new WINLIS();
	}
	
	public void windowClosed(WindowEvent we)
	{
		System.out.println("windowClosed\n");
	}
	
	public void windowClosing(WindowEvent we)
	{
		System.out.println("windowClosing\n");
		dispose();
	}
	
	public void windowActivated(WindowEvent we)
	{
		System.out.println("windowActivated\n");
	}
	
	public void windowIconified(WindowEvent we)
	{
		System.out.println("windowIconified\n");
	}
	
	public void windowDeiconified(WindowEvent we)
	{
		System.out.println("windowDeIconfied\n");
	}
	
	public void windowOpened(WindowEvent we)
	{
		System.out.println("windowOpened\n");
	}
	
	public void windowDeactivated(WindowEvent we)
	{
		System.out.println("windowDeactivated\n");
	}
}