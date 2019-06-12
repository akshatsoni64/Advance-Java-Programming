import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class CHOICEPRDT4 extends Frame implements ItemListener
{
	Connection con=null;
	Statement s=null;
	ResultSet rs=null;
	
	Choice c=new Choice();
	Label item=new Label("Product Name : ");
	Label price=new Label("Product Price : ");
	
	public CHOICEPRDT4()
	{		
		setSize(600,600);
		setTitle("CHOICEPRDT4");
		setLayout(new GridLayout(3,0));
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/ppud","root","");
			System.out.println("Connection Successful");
			s=con.createStatement();
			rs=s.executeQuery("select * from product");
			while(rs.next())
			{
				c.add(rs.getString("pname"));
			}
			con.close();
			s.close(); 
			rs.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		add(c);
		c.addItemListener(this);
		add(item);
		add(price);
		
		setVisible(true);
	} 
	
	public void itemStateChanged(ItemEvent ie)
	{
		try
		{
			item.setText("Product Name : "+c.getSelectedItem());
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/ppud","root","");
			System.out.println("Connection Successful");
			s=con.createStatement();
			rs=s.executeQuery("select * from product where pname='"+c.getSelectedItem()+"'");
			
			while(rs.next())
			{
				price.setText("Product Price : "+rs.getString("price"));
			}
			con.close();
			s.close();
			rs.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String args[])
	{
		new CHOICEPRDT4();
	}
}