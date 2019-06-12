//Develop an applet to demonstrate use of KeyListener 

/*
	<applet code="KEYLIS" height="600" width="600"></applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KEYLIS extends Applet implements KeyListener
{
	TextField tf=new TextField(12);
	TextArea ta=new TextArea(30,50);
	public void init()
	{
		add(tf);
		add(ta);
		tf.addKeyListener(this);
	}
		
	public void keyPressed(KeyEvent ke)
	{
		ta.append("Pressed"+ke.getKeyChar()+"\n");
	} 
	
	public void keyReleased(KeyEvent ke)
	{
		ta.append("Released"+ke.getKeyChar()+"\n");
	}
	
	public void keyTyped(KeyEvent ke)
	{
		ta.append("You Typed "+ke.getKeyChar()+"\n");
	}
} 