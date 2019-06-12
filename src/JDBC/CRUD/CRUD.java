import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CRUD extends Frame implements ActionListener
{
	TextField name=new TextField(20);
	TextField eno=new TextField(12);
	Button ins=new Button("Insert");
	Button updt=new Button("Update");
	Button del=new Button("Delete");
	Button sel=new Button("Select");
	
	Connection con=null;
	Statement st=null;
	
	public CRUD()
	{			
		setTitle("JDBC CRUD Example");
		setSize(600,600);
		setLayout(new GridLayout(4,2));
		add(new Label("Name :"));
		add(name);
		add(new Label("Enrollment No. :"));
		add(eno);
		add(ins);
		add(updt);
		add(del);
		add(sel);
		
		ins.addActionListener(this);
		updt.addActionListener(this);
		del.addActionListener(this);
		sel.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:temp");
			System.out.println("Connection Successful..\n");
			Statement st=con.createStatement();	
			if(ae.getSource()==ins)
			{
				System.out.println("Inserting...");
				PreparedStatement ps=con.prepareStatement("insert into Student(Name,Eno) values(?,?)");
				String nm=name.getText();
				ps.setString(1,nm);
				Integer no=Integer.parseInt(eno.getText());
				ps.setInt(2,no.intValue());
				int o=ps.executeUpdate();
				System.out.println("Inserted Successfully");
			}
			else if(ae.getSource()==updt)
			{
				System.out.println("Updating...");
				String nm=name.getText();
				Integer no=Integer.parseInt(eno.getText());
				PreparedStatement ps=con.prepareStatement("update Student set Eno='"+no.intValue()+"' where Name='"+nm+"'");
				int o=ps.executeUpdate();
				System.out.println("Updated Successfully");
			}
			else if(ae.getSource()==del)
			{
				System.out.println("Deleting...");
				String nm=name.getText();
				Integer no=Integer.parseInt(eno.getText());
				Statement s=con.createStatement();
				int o=s.executeUpdate("delete from Student where Eno="+no.intValue()+"");
				System.out.println("Deleted Successfully");
			}
			else if(ae.getSource()==sel)
			{
				System.out.println("Displaying...");
				ResultSet rs=st.executeQuery("select * from Student");
				while(rs.next())
				{
					System.out.print(rs.getString("Name")+"\t");
					System.out.println(rs.getInt("Eno"));
				}
			}

		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
	
	public static void main(String args[])
	{
		new CRUD();
	} 
}