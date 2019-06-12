import java.awt.*;
import java.applet.*;

/*
	<applet code="CHOICELIST" height="600" width="600"></applet>
*/

public class CHOICELIST extends Applet
{ 
	Choice c=new Choice();
	
	public void init()
	{
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("C");
		
		add(c);
	}
}