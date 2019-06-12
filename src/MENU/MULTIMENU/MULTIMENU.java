//Develop an applet to demonstrate building a menu

import java.awt.*;
import java.awt.event.*;

public class MULTIMENU extends Frame implements ActionListener
{
	MenuBar mb=new MenuBar();
	
	Menu mFile=new Menu("File");
	Menu mEdit=new Menu("Edit");
	
	MenuItem miOpen=new MenuItem("Open");
	MenuItem miClose=new MenuItem("Close");
	MenuItem miUndo=new MenuItem("Undo");
	MenuItem miRedo=new MenuItem("Redo");
	Menu mOther=new Menu("Other");
	
	MenuItem miCut=new MenuItem("Cut");
	MenuItem miCopy=new MenuItem("Copy");
	MenuItem miPaste=new MenuItem("Paste");
	
	PopupMenu pm=new PopupMenu("Popup");
	MenuItem pmiUndo=new MenuItem("Undo");
	MenuItem pmiRedo=new MenuItem("Redo");
	MenuItem pmiSelect=new MenuItem("Select");
	
	TextArea txt=new TextArea();
	
	public MULTIMENU()
	{
		addWindowListener(new WindowAdapter()
		 {
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		
		setSize(600,600);
		setLayout(new FlowLayout());
		setTitle("MULTIMENU");
		
		setMenuBar(mb);
		mb.add(mFile);
		mb.add(mEdit);
		
		mFile.add(miOpen);
		mFile.add(miClose);
		
		mEdit.add(miUndo);
		mEdit.add(miRedo);
		mEdit.add(mOther);
		mOther.add(miCut);
		mOther.add(miCopy);
		mOther.add(miPaste);
		
		pm.add(pmiUndo);
		pm.add(pmiRedo);
		pm.addSeparator();
		pm.add(pmiSelect);
		
		this.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				pm.show(this,me.getX(),me.getY());
			}
		});
		
		add(pm);
		add(txt);
		
		miOpen.addActionListener(this);
		miClose.addActionListener(this);
		miUndo.addActionListener(this);
		miRedo.addActionListener(this);
		miCut.addActionListener(this);
		miCopy.addActionListener(this);
		miPaste.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		MenuComponent mc=(MenuComponent)ae.getSource();
		Menu m1=(Menu)mc.getParent();
		if(m1 instanceof Menu)
		{
			txt.setText("Clicked : "+":"+m1.getLabel()+"-->"+ae.getActionCommand());
		}
	}
	
	public static void main(String args[])
	{
		MULTIMENU mt=new MULTIMENU();
	}
}