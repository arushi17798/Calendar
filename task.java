import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class task extends Frame implements ActionListener,WindowListener 
{
				TextField t=new TextField();
				TextField t1=new TextField();
				TextField t2=new TextField();
				TextField t3=new TextField();
			//	TextArea a=new TextArea();
				Button d=new Button("DONE");
				public String tda[]=new String[10];
	
	public int x=1;
	task(int k)
	{
				setLayout(null);
				setBackground(Color.pink);
				setSize(300,220);
				setFont(new Font("Cooper Black", Font.BOLD, 12));
		
				t.setBounds(50,50,200,50);
			
				
		
				t1.setBounds(50,110,30,30);
				t2.setBounds(90,110,30,30);
				t3.setBounds(130,110,30,30);
				
				d.setBounds(120,170,50,30);
				d.addActionListener((ActionListener)this);
				add(d);
				//add(a);
				add(t1);
				add(t2);
				add(t3);
				add(t);
				x=k;
				
				addWindowListener(this);
				setVisible(true);
				
	}
	public void actionPerformed(ActionEvent a)
	{

	
			if(a.getSource()==d)
			{		
			
						BufferedWriter writer = null;
						try
						{
					
						writer = new BufferedWriter(new FileWriter("data.txt",true));
						writer.newLine();
						writer.write("\n "+x+"/11/17"+" EVENT: "+t.getText());
						writer.write("  TIME: "+t1.getText()+":"+t2.getText()+" "+t3.getText());
						
						int i=0;
						
						tda[i]=t1.getText()+":"+t2.getText()+t3.getText();
						i++;
						
						writer.close();
					
						t.setText("");
						t1.setText("");
						t2.setText("");
						t3.setText("");

						}
				catch(Exception e1)
			{
		
			}
			}
	}

	
	public void windowClosing(WindowEvent e)
		{
				System.exit(0);
		}
			public void windowOpened(WindowEvent e)        {   }
			public void windowClosed(WindowEvent e)        {   }
			public void windowActivated(WindowEvent e)     {   }
			public void windowDeactivated(WindowEvent e)   {   }
			public void windowIconified(WindowEvent e)     {   }
			public void windowDeiconified(WindowEvent e)   {   }
	

}