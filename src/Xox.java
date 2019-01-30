/**
 *  author : bangaru sai jagadeesh
 *
 **/
import java.awt.*;
import java.awt.event.*;

public class Xox extends Frame implements ActionListener
{
	Button b1;
	TextField ta1,ta2,ta3,ta4,ta5,ta6,ta7,ta8,ta9,ta10;

Xox()
{
	setLayout(null);
	
	/* these are the text fields that look like boxes in the window */	
	
	ta1=new TextField();
	ta2=new TextField();
	ta3=new TextField();
	ta4=new TextField();
	ta5=new TextField();
	ta6=new TextField();
	ta7=new TextField();
	ta8=new TextField();
	ta9=new TextField();
	
	ta10=new TextField(100);
	ta10.setVisible(false);
	
	/* Button for restarting the game */
	
	b1=new Button("RESTART");
	
	b1.addActionListener(this);
	
        /* the text fields have to respond to the click of the mouse . Hence , an action listener is to be added. */
        
	ta1.addActionListener(this);ta2.addActionListener(this);ta3.addActionListener(this);
	ta4.addActionListener(this);ta5.addActionListener(this);ta6.addActionListener(this);
	ta7.addActionListener(this);ta8.addActionListener(this);ta9.addActionListener(this);
	
        
        /* the text fields cannot be edited by a player . */     
        
	ta1.setEditable(false);ta2.setEditable(false);ta3.setEditable(false);
	ta4.setEditable(false);ta5.setEditable(false);ta6.setEditable(false);
	ta7.setEditable(false);ta8.setEditable(false);ta9.setEditable(false);
	
	ta1.setBackground(Color.WHITE);ta2.setBackground(Color.WHITE);ta3.setBackground(Color.WHITE);
	ta4.setBackground(Color.WHITE);ta5.setBackground(Color.WHITE);ta6.setBackground(Color.WHITE);
	ta7.setBackground(Color.WHITE);ta8.setBackground(Color.WHITE);ta9.setBackground(Color.WHITE);
	
	Font f=new Font(Font.DIALOG,Font.ITALIC,108);
	
	ta1.setFont(f);ta2.setFont(f);ta3.setFont(f);
	ta4.setFont(f);ta5.setFont(f);ta6.setFont(f);
	ta7.setFont(f);ta8.setFont(f);ta9.setFont(f);
	
	/* panel that contains all the text fields */
	
	Panel p=new Panel();
	
	p.setBounds(100,100,300,300);
	ta10.setBounds(100,450,250,30);b1.setBounds(300,500,100,30);
	
	b1.setBackground(Color.blue);
	GridLayout g=new GridLayout(3,3);
	p.setLayout(g);
	
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
	
	p.add(ta1);p.add(ta2);p.add(ta3);p.add(ta4);p.add(ta5);p.add(ta6);p.add(ta7);p.add(ta8);p.add(ta9);
	add(p);add(ta10);add(b1);
}

static int j=0,i=0;

/* when a mouse click happens , the following code gets executed . */

public void actionPerformed(ActionEvent e) {
	
	if(ta10.getText().equals(""))
	{
		if(ta1==e.getSource())
	{
		if(ta1.getText().equals(""))
		{
		if(i==0)
		{
			ta1.setForeground(Color.green);
			ta1.setText("X");
		}
		else
		{
			ta1.setForeground(Color.red);
			ta1.setText("O");
		}
		}
	}
	if(ta2==e.getSource())
	{
		if(ta2.getText().equals(""))
		{
		if(i==0)
		{
			ta2.setForeground(Color.green);
			ta2.setText("X");
		}
		else
		{
			ta2.setForeground(Color.red);
			ta2.setText("O");
		}
		}
	}
	if(ta3==e.getSource())
	{
		if(ta3.getText().equals(""))
		{
		if(i==0)
		{
			ta3.setForeground(Color.green);
			ta3.setText("X");
		}
		else
		{
			ta3.setForeground(Color.red);
			ta3.setText("O");
		}
		}
	}
	if(ta4==e.getSource())
	{
		if(ta4.getText().equals(""))
		{
		if(i==0)
		{
			ta4.setForeground(Color.green);
			ta4.setText("X");
		}
		else
		{
			ta4.setForeground(Color.red);
			ta4.setText("O");
		}
		}
	}
	if(ta5==e.getSource())
	{
		if(ta5.getText().equals(""))
		{
		if(i==0)
		{
			ta5.setForeground(Color.green);
			ta5.setText("X");
		}
		else
		{
			ta5.setForeground(Color.red);
			ta5.setText("O");
		}
		}
	}
	if(ta6==e.getSource())
	{
		if(ta6.getText().equals(""))
		{
		if(i==0)
		{
			ta6.setForeground(Color.green);
			ta6.setText("X");
		}
		else
		{
			ta6.setForeground(Color.red);
			ta6.setText("O");
		}
		}
	}
	if(ta7==e.getSource())
	{
		if(ta7.getText().equals(""))
		{
		if(i==0)
		{
			ta7.setForeground(Color.green);
			ta7.setText("X");
		}
		else
		{
			ta7.setForeground(Color.red);
			ta7.setText("O");
		}
		}
	}
	if(ta8==e.getSource())
	{
		if(ta8.getText().equals(""))
		{
		if(i==0)
		{
			ta8.setForeground(Color.green);
			ta8.setText("X");
		}
		else
		{
			ta8.setForeground(Color.red);
			ta8.setText("O");
		}
		}
	}
	if(ta9==e.getSource())
	{
		if(ta9.getText().equals(""))
		{
		if(i==0)
		{
			ta9.setForeground(Color.green);
			ta9.setText("X");
		}
		else
		{
			ta9.setForeground(Color.red);
			ta9.setText("O");
		}
		}
	}
	if(i==0)i++;
	else i=0;
	check();
	}
	if(b1==e.getSource())
	{
		ta1.setText("");
		ta2.setText("");
		ta3.setText("");
		ta4.setText("");
		ta5.setText("");
		ta6.setText("");
		ta7.setText("");
		ta8.setText("");
		ta9.setText("");
		ta10.setText("");
		i=0;
		ta10.setVisible(false);
	}
}
	int a[][]=new int[3][3];
	int rows[]=new int[3];
	int columns[]=new int[3];
	int diag[]=new int[2];
	int z=1;
	
/* this funtion checks whether the game has ended or not */
public void check()
{
	diag[0]=0;
	diag[1]=0;
	z=1;
	for(int i1=0;i1<3;i1++)
	{
		for(int j1=0;j1<3;j1++)
		{
			a[i1][j1]=7;
			rows[i1]=0;
			columns[j1]=0;
					
		}
	}
	if(ta1.getText().equals("X"))
		a[0][0]=0;
	else if(ta1.getText().equals("O"))
		a[0][0]=1;
	else z=9;
	if(ta2.getText().equals("X"))
		a[0][1]=0;
	else if(ta2.getText().equals("O"))
		a[0][1]=1;
	else z=9;
	if(ta3.getText().equals("X"))
		a[0][2]=0;
	else if(ta3.getText().equals("O"))
		a[0][2]=1;
	else z=9;
	if(ta4.getText().equals("X"))
		a[1][0]=0;
	else if(ta4.getText().equals("O"))
		a[1][0]=1;
	else z=9;
	if(ta5.getText().equals("X"))
		a[1][1]=0;
	else if(ta5.getText().equals("O"))
		a[1][1]=1;
	else z=9;
	if(ta6.getText().equals("X"))
		a[1][2]=0;
	else if(ta6.getText().equals("O"))
		a[1][2]=1;
	else z=9;
	if(ta7.getText().equals("X"))
		a[2][0]=0;
	else if(ta7.getText().equals("O"))
		a[2][0]=1;
	else z=9;
	if(ta8.getText().equals("X"))
		a[2][1]=0;
	else if(ta8.getText().equals("O"))
		a[2][1]=1;
	else z=9;
	if(ta9.getText().equals("X"))
		a[2][2]=0;
	else if(ta9.getText().equals("O"))
		a[2][2]=1;
	else z=9;
	
	for(int i2=0;i2<3;i2++)
	{
		for(int j2=0;j2<3;j2++)
		{
			rows[i2]+=a[i2][j2];
			columns[j2]+=a[i2][j2];
			if(i2==j2)
			{
				diag[0]+=a[i2][j2];
			}
			if(i2+j2==2)
			{
				diag[1]+=a[i2][j2];
			}
			
		}
	}
	
	if(rows[0]==0||rows[1]==0||rows[2]==0||columns[0]==0||columns[1]==0||columns[2]==0||diag[0]==0||diag[1]==0)
	{
		ta10.setVisible(true);
		ta10.setText("Hurray!!! Player 1 wins");	
	}
	else if(rows[0]==3||rows[1]==3||rows[2]==3||columns[0]==3||columns[1]==3||columns[2]==3||diag[0]==3||diag[1]==3)
	{
		ta10.setVisible(true);
		ta10.setText("Hurray!!! Player 2 wins");
	}
	
	if(z==1&&ta10.getText().equals(""))
	{
		ta10.setVisible(true);
		ta10.setText("OOPS !!! IT'S A DRAW");	
	}
}

        /* Driver Code */

public static void main(String args[])
{
	Xox x=new Xox();
	x.setSize(600,600);
	x.setBackground(Color.yellow);
	x.setVisible(true);
	
        Font f=new Font(Font.DIALOG,Font.BOLD,16);
	
        x.setFont(f);
	x.setTitle("TIC - TAC - TOE");
}

}
