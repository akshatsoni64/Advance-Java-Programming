import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
	<applet code="CHOICEPRDT" height="600" width="600"></applet>
*/

public class CHOICEPRDT extends Applet implements ItemListener 
{
	Choice c=new Choice();
	Label item=new Label("Name : ");
	Label price=new Label("Price : ");
	
	Connection con=null;
	Statement s=null;
	ResultSet rs=null;
	
	public void init()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:testsql","root"," ");
			showStatus("INIT : Connection Successful");
			
			s=con.createStatement();
			rs=s.executeQuery("select * from product");
			
			while(rs.next())
			{
				c.add(rs.getString("pname"));
			}
		}
		catch(Exception e)
		{
			System.out.println("INIT : "+e.toString());
		}
		
		setLayout(new GridLayout(3,0));
		add(c);
		add(item);
		add(price);
		c.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		try
		{
			item.setText("Name : "c.getSelectedItem());
			String name=item.getText();
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:testsql","root"," ");
			showStatus("ISC : Connection Successful");
			
			s=con.createStatement();
			rs=s.executeQuery("select * from product where pname='"+name+"'");
			
			while(rs.next())
			{
				price.setText("Price : "+rs.getInt("price"));
			}
		}
		catch(Exception e)
		{
			System.out.println("ISC : "+e.toString());
		}
	}
}