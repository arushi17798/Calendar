import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class reminder extends Frame
{
	reminder(String a)
	{
			setLayout(null);
			setSize(350,200);
			setBackground(Color.pink);
			setFont(new Font("Cooper Black", Font.BOLD, 12));
		
			Label l=new Label(a);
			l.setBounds(50,50,250,150);
			add(l);
			setVisible(true);
	}
	

}