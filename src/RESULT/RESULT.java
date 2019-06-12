//Develop an applet to calculate result of a student

import java.awt.*;
import java.awt.event.*;

public class RESULT extends Frame implements ActionListener
{
	/*name,class,rollno,
	panel: (label)marks english,hindi,sci,ss,maths
	panel: total marks,per,grade
	btn: calc,close*/
	Panel pInfo=new Panel(new GridLayout(3,2));
	Panel pMarks=new Panel(new GridLayout(5,2));
	Panel pResult=new Panel(new GridLayout(3,2));
	
	TextField txtName=new TextField(20);
	TextField txtClass=new TextField(20);
	TextField txtRollNo=new TextField(20);
	
	TextField txtEnglish=new TextField(20);
	TextField txtHindi=new TextField(20);
	TextField txtScience=new TextField(20);
	TextField txtSS=new TextField(20);
	TextField txtMaths=new TextField(20);
	
	TextField txtTotal=new TextField(20);
	TextField txtPercentage=new TextField(20);
	TextField txtGrade=new TextField(20);
	
	Button btnCalc=new Button("Calculate");
	Button btnCancel=new Button("Cancel");
	
	public RESULT()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				dispose();
			}
		});
		
		setSize(600,600);
		setLayout(new GridLayout(2,2));
		setTitle("RESULT");
		add(pInfo);
		add(pMarks);
		add(pResult);
		
		pInfo.add(new Label("Name : "));
		pInfo.add(txtName);
		pInfo.add(new Label("Class : "));
		pInfo.add(txtClass);
		pInfo.add(new Label("Roll No : "));
		pInfo.add(txtRollNo);
			
		//pMarks.add(new Label("Marks"));
		pMarks.add(new Label("English : "));
		pMarks.add(txtEnglish);
		pMarks.add(new Label("Hindi : "));
		pMarks.add(txtHindi);
		pMarks.add(new Label("Science : "));
		pMarks.add(txtScience);
		pMarks.add(new Label("Social Science : "));
		pMarks.add(txtSS);
		pMarks.add(new Label("Maths : "));
		pMarks.add(txtMaths);
		
		pResult.add(new Label("Total : "));
		pResult.add(txtTotal);
		pResult.add(new Label("Percentage : "));
		pResult.add(txtPercentage);
		pResult.add(new Label("Grade : "));
		pResult.add(txtGrade);
		
		add(btnCalc);
		add(btnCancel);
		
		setVisible(true);
	}
	
	//>90 A+,>80 A,>70 B,>60 C,>50 D,>40 E,<40 F
	
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	
	public static void main(String args[])
	{
		new RESULT();
	}
}