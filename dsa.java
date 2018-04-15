import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;


import java.text.DateFormat;

class proj extends Frame implements ActionListener,WindowListener 
{
	Button b[]=new Button[32];
	TextField todoList=new TextField();
	Button tdl=new Button("ADD");
	//TextArea tdd=new TextArea();
		 int k=1;
	Button v1=new Button("VIEW TO DO LIST");
	Button v2=new Button("VIEW APPOINTMENTS");

	Image ig= Toolkit.getDefaultToolkit().getImage("wow.jpg");
	
	dsa()
	{
		setLayout(null);
		setSize(500,280);
		//setBackground(new Color(184,239,238));
		setFont(new Font("Cooper Black", Font.BOLD, 12));
		
		todoList.setBounds(300,60,180,80);
		add(todoList);

		GraphicsEnvironment g=GraphicsEnvironment.getLocalGraphicsEnvironment();
		Point pt=g.getCenterPoint();
		setLocation(pt);
		setLocation((pt.x-200),(pt.y-100));
		
		tdl.setBounds(360,145,50,30);
		
		v1.setBounds(350,180,100,20);
		v1.setBackground(new Color(125,230,206));
		add(v1);
		
		
		v2.setBounds(350,210,130,20);
		v2.setBackground(new Color(125,230,206));
		add(v2);
		

		
		Button td=new Button("ADD TO YOUR TO DO LIST");
		td.setBounds(300,35,150,20);
		td.setBackground(new Color(184,239,238));
		add(td);
		
		Button l1=new Button(" S ");
		l1.setBounds(40,35,20,20);
		l1.setBackground(Color.pink);
		add(l1);
		
		Button l2=new Button(" M ");
		l2.setBounds(75,35,20,20);
		l2.setBackground(new Color(184,239,238));
		add(l2);
		
		Button l3=new Button(" T ");
		l3.setBounds(110,35,20,20);
		l3.setBackground(new Color(184,239,238));
		add(l3);
		
		Button l4=new Button(" W ");
		l4.setBounds(145,35,20,20);
		l4.setBackground(new Color(184,239,238));
		add(l4);
		
		Button l5=new Button(" T ");
		l5.setBounds(180,35,20,20);
		l5.setBackground(new Color(184,239,238));
		add(l5);
		
		Button l6=new Button(" F ");
		l6.setBounds(215,35,20,20);
		l6.setBackground(new Color(184,239,238));
		add(l6);
		
		Button l7=new Button(" S ");
		l7.setBounds(250,35,20,20);
		l7.setBackground(Color.pink);
		add(l7);
		
		//system time//
		Date date = new Date();
        String strDateFormat = "hh:mm a";
        String d="dd/mm/yy";
	
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        DateFormat df=new SimpleDateFormat(d);
		
		String formattedDate= dateFormat.format(date);
		String fd=dateFormat.format(date);
		
        System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
		
		
		try
		{
				FileReader reader=new FileReader("data.txt");
				BufferedReader br = new BufferedReader(reader);
				String text;
			
				while((text=br.readLine())!=null)
				{
					if(text.contains(formattedDate) && text.contains(fd))
					{
					
						new reminder(text);
						Toolkit.getDefaultToolkit().beep();
					}
				}
				
		}
		catch(Exception y)
		{
			
		}
		
		int x=35,y=95;
					b[1]=new Button("1");
					b[1].setBounds(140,60,30,30);
					b[1].setBackground(new Color(220,241,248));
					b[1].setFont(new Font("Cooper Black", Font.BOLD, 12));
					
					b[2]=new Button("2");
					b[2].setBounds(175,60,30,30);
					b[2].setBackground(new Color(220,241,248));
					b[2].setFont(new Font("Cooper Black", Font.BOLD, 12));
					
					b[3]=new Button("3");
					b[3].setBounds(210,60,30,30);
					b[3].setBackground(new Color(220,241,248));
					b[3].setFont(new Font("Cooper Black", Font.BOLD, 12));
			
					b[4]=new Button("4");
					b[4].setBounds(245,60,30,30);
					b[4].setBackground(new Color(220,241,248));
					b[4].setFont(new Font("Cooper Black", Font.BOLD, 12));
					
					k=5;
		for(int i=1;i<31;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(k!=31)
				{
					b[k]=new Button(""+k);
					b[k].setBounds(x,y,30,30);
					b[k].setBackground(new Color(220,241,248));
					b[k].setFont(new Font("Cooper Black", Font.BOLD, 12));
					k++;
					x=x+35;
					
				}
				else
					break;
			}
			System.out.print("\n");
			y=y+35;
			x=35;
		}
		v1.addActionListener((ActionListener)this);
		
		v2.addActionListener((ActionListener)this);
		
		
		
		tdl.addActionListener((ActionListener)this);
		add(tdl);
		
		b[1].addActionListener((ActionListener)this);
		add(b[1]);
		
		b[2].addActionListener((ActionListener)this);
		add(b[2]);
		
		b[3].addActionListener((ActionListener)this);
		add(b[3]);
		
		b[4].addActionListener((ActionListener)this);
		add(b[4]);
		
		b[5].addActionListener((ActionListener)this);
		add(b[5]);
		
		b[6].addActionListener((ActionListener)this);
		add(b[6]);
		
		b[7].addActionListener((ActionListener)this);
		add(b[7]);
		
		b[8].addActionListener((ActionListener)this);
		add(b[8]);
		
		b[9].addActionListener((ActionListener)this);
		add(b[9]);
		
		b[10].addActionListener((ActionListener)this);
		add(b[10]);
		
		b[11].addActionListener((ActionListener)this);
		add(b[11]);
		
		b[12].addActionListener((ActionListener)this);
		add(b[12]);
		
		b[13].addActionListener((ActionListener)this);
		add(b[13]);
		
		b[14].addActionListener((ActionListener)this);
		add(b[14]);
		
		b[15].addActionListener((ActionListener)this);
		add(b[15]);
		
		b[16].addActionListener((ActionListener)this);
		add(b[16]);
		
		b[17].addActionListener((ActionListener)this);
		add(b[17]);
		
		b[18].addActionListener((ActionListener)this);
		add(b[18]);
		
		b[19].addActionListener((ActionListener)this);
		add(b[19]);
		
		b[20].addActionListener((ActionListener)this);
		add(b[20]);
		
		b[21].addActionListener((ActionListener)this);
		add(b[21]);
		
		b[22].addActionListener((ActionListener)this);
		add(b[22]);
		
		b[23].addActionListener((ActionListener)this);
		add(b[23]);
		
		b[24].addActionListener((ActionListener)this);
		add(b[24]);
		
		b[25].addActionListener((ActionListener)this);
		add(b[25]);
		
		b[26].addActionListener((ActionListener)this);
		add(b[26]);
		
		b[27].addActionListener((ActionListener)this);
		add(b[27]);
		
		b[28].addActionListener((ActionListener)this);
		add(b[28]);
		
		b[29].addActionListener((ActionListener)this);
		add(b[29]);
		
		b[30].addActionListener((ActionListener)this);
		add(b[30]);
		
		//b[31].addActionListener((ActionListener)this);
		//add(b[31]);
		
		
		addWindowListener(this);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawImage(ig,0,0,500,280,this);
		
	}
	public void actionPerformed(ActionEvent e)
		{
				if(e.getSource()==tdl)
				{
				BufferedWriter writer = null;
						try
						{
						writer = new BufferedWriter(new FileWriter("todoList.txt",true));
						writer.newLine();
						writer.write("\n"+todoList.getText());
						writer.close();
						
						}
						catch(Exception x)
						{
							
							
						}
				todoList.setText("");
				}
				if(e.getSource()==v1)
				{
					new todo();
					
				}
				if(e.getSource()==v2)
				{
					new appts();
						
				}
				if(e.getSource()==b[1])
				{
					new task(1);
				}
				if(e.getSource()==b[2])
				{
					new task(2);
				}
				if(e.getSource()==b[3])
				{
					new task(3);
				}
				if(e.getSource()==b[4])
				{
					new task(4);
				}
				if(e.getSource()==b[5])
				{
					new task(5);
				}
				if(e.getSource()==b[6])
				{
					new task(6);
				}
				if(e.getSource()==b[7])
				{
					new task(7);
				}
				if(e.getSource()==b[8])
				{
					new task(8);
				}
				if(e.getSource()==b[9])
				{
					new task(9);
				}
				if(e.getSource()==b[10])
				{
					new task(10);
				}
				if(e.getSource()==b[11])
				{
					new task(11);
				}
				if(e.getSource()==b[12])
				{
					new task(12);
				}
				if(e.getSource()==b[13])
				{
					new task(13);
				}
				if(e.getSource()==b[14])
				{
					new task(14);
				}
				if(e.getSource()==b[15])
				{
					new task(15);
				}
				if(e.getSource()==b[16])
				{
					new task(16);
				}
				if(e.getSource()==b[17])
				{
					new task(17);
				}
				if(e.getSource()==b[18])
				{
					new task(18);
				}
				if(e.getSource()==b[19])
				{
					new task(19);
				}
				if(e.getSource()==b[20])
				{
					new task(20);
				}
				if(e.getSource()==b[21])
				{
					new task(21);
				}
				if(e.getSource()==b[22])
				{
					new task(22);
				}
				if(e.getSource()==b[23])
				{
					new task(23);
				}
				if(e.getSource()==b[24])
				{
					new task(24);
				}
				if(e.getSource()==b[25])
				{
					new task(25);
				}
				if(e.getSource()==b[26])
				{
					new task(26);
				}
				if(e.getSource()==b[27])
				{
					new task(27);
				}
				if(e.getSource()==b[28])
				{
					new task(28);
				}
				if(e.getSource()==b[29])
				{
					new task(29);
				}
				if(e.getSource()==b[30])
				{
					new task(30);
				}
			//	if(e.getSource()==b[31])
				//{
					//new task(31);
				//}
			
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
	
	
	public static void main(String args[])
	{
		dsa obj=new dsa();
	}
}