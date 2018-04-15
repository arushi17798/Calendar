import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class appts extends Frame
{
	TextArea a=new TextArea();
	appts()
	{
			setLayout(null);
			setSize(300,220);
			setFont(new Font("Cooper Black", Font.BOLD, 12));
		
			setBackground(Color.pink);
		a.setBounds(20,50,260,150);
		add(a);
		
				try
		{
				FileReader reader=new FileReader("data.txt");
				BufferedReader br = new BufferedReader(reader);
				String text;
			
				while((text=br.readLine())!=null)
				{
					a.append("\n"+text);
				}
				
		}
		catch(Exception y)
		{
			
		}
		setVisible(true);
	}


		public static void main(String args[])
		{
		
			appts obj=new appts();
			
		}
	
}