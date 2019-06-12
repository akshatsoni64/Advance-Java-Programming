/*Practical 9: Create an application that displays a frame with a menu bar. When a user selects any menu or menu item,
 display that selection on a text area in the center of the frame*/

import java.awt.*;
import java.awt.event.*;

public class MENUTEXT extends Frame implements ActionListener
{
	MenuBar mb=new MenuBar();
	
	Menu mFile=new Menu("File");
	Menu mEdit=new Menu("Edit");
	
	MenuItem miNew=new MenuItem("New");
	MenuItem miOpen=new MenuItem("Open");
	MenuItem miSave=new MenuItem("Save");
	MenuItem miSaveAs=new MenuItem("Save As");
	MenuItem miPrint=new MenuItem("Print");
	MenuItem miQuit=new MenuItem("Quit");
	
	MenuItem miUndo=new MenuItem("Undo");
	MenuItem miRedo=new MenuItem("Redo");
	MenuItem miCut=new MenuItem("Cut");
	MenuItem miCopy=new MenuItem("Copy");
	MenuItem miPaste=new MenuItem("Paste");
	MenuItem miDelete=new MenuItem("Delete");
	
	TextArea txt=new TextArea();
	String msg;
	
	public MENUTEXT()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		
		setSize(600,600);
		setTitle("MENUTEXT");
		setLayout(new FlowLayout());
		
		this.setMenuBar(mb);
		
		mb.add(mFile);
		mb.add(mEdit);
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miSaveAs);
		mFile.add(miPrint);
		mFile.add(miQuit);
		
		mEdit.add(miUndo);
		mEdit.add(miRedo);
		mEdit.add(miCut);
		mEdit.add(miCopy);
		mEdit.add(miPaste);
		mEdit.add(miDelete);
		
		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miSaveAs.addActionListener(this);
		miPrint.addActionListener(this);
		miQuit.addActionListener(this);
		
		miUndo.addActionListener(this);
		miRedo.addActionListener(this); 
		miCut.addActionListener(this);
		miCopy.addActionListener(this);
		miPaste.addActionListener(this); 
		miDelete.addActionListener(this);
		
		add(txt);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{		
		//Here MenuComponent is used to get the menu from which the menuItem is clicked,getSource will return the Object that is clicked which is converted to MenuComponent
		MenuComponent cp=(MenuComponent)ae.getSource();
		//Then here it will return the Menu, getParent will return the MenuContainer which is converted to menu
		Menu m1=(Menu)cp.getParent();
		if(m1 instanceof Menu)
		{
			msg = "You have Selected: "+m1.getLabel()+" --> ";//Then that menu object is used here to get the label of the menu
			txt.setText(msg+ae.getActionCommand());
		}		
	}
	
	public static void main(String args[])
	{
		new MENUTEXT();
	}
}