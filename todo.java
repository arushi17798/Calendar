import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class todo extends Frame
{
	TextArea tdd=new TextArea();
	todo()
	{
			setLayout(null);
			setSize(300,220);
			setFont(new Font("Cooper Black", Font.BOLD, 12));
		
			setBackground(Color.pink);
		tdd.setBounds(50,50,170,150);
		add(tdd);
		
		try
		{
				FileReader reader=new FileReader("todoList.txt");
				BufferedReader br = new BufferedReader(reader);
				String text;
				while((text=br.readLine())!=null)
				{
						tdd.append(text+"\n");
				}
			
		}
		catch(Exception y)
		{
			
		}
		setVisible(true);
		
	}


		public static void main(String args[])
		{
		
			todo obj=new todo();
			
		}
	
}