import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Puzzle implements ActionListener
{
	int x=0,y=0,c=0;
	JFrame jf;
	JButton b[];
	Puzzle()
	{
		jf=new JFrame();
		b=new JButton[9];
		jf.setLayout(null);
		jf.setSize(300,300);
        b[0]=new JButton("1");
        b[1]=new JButton(" ");
        b[2]=new JButton("3");
        b[3]=new JButton("4");
        b[4]=new JButton("5");
        b[5]=new JButton("6");
        b[6]=new JButton("7");
        b[7]=new JButton("8");
        b[8]=new JButton("2");
        for(int i=0;i<9;i++, x+=50, c++)
        {if(c%3==0)
            	{y+=50;x=0;}
        	b[i].setBounds(x,y,50,50);

        	b[i].addActionListener(this);
        	jf.add(b[i]);
        }
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

	}
	public void actionPerformed(ActionEvent e)
        {String s="";
           if(e.getSource()==b[0])
           {s=b[0].getLabel();
           	    if(b[1].getLabel().equals(" "))
                      {b[1].setLabel(s);b[0].setLabel(" ");}
                else if(b[3].getLabel().equals(" "))
                	  {b[3].setLabel(s);b[0].setLabel(" ");}
            }
           else if(e.getSource()==b[1])
           	{s=b[1].getLabel();
           	    if(b[0].getLabel().equals(" "))
                      {b[0].setLabel(s);b[1].setLabel(" ");}
                else if(b[2].getLabel().equals(" "))
                	  {b[2].setLabel(s);b[1].setLabel(" ");}
                	else if(b[4].getLabel().equals(" "))
                	  {b[4].setLabel(s);b[1].setLabel(" ");}
            }
            else if(e.getSource()==b[2])
           	{s=b[2].getLabel();
           		
           	    if(b[1].getLabel().equals(" "))
                      {b[1].setLabel(s);b[2].setLabel(" ");}
                else if(b[5].getLabel().equals(" "))
                	  {b[5].setLabel(s);b[2].setLabel(" ");}
            }
            else if(e.getSource()==b[3])
           	{s=b[3].getLabel();
           	    if(b[0].getLabel().equals(" "))
                      {b[0].setLabel(s);b[3].setLabel(" ");}
                else if(b[4].getLabel().equals(" "))
                	  {b[4].setLabel(s);b[3].setLabel(" ");}
                	else if(b[6].getLabel().equals(" "))
                	  {b[6].setLabel(s);b[3].setLabel(" ");}
            }
            else if(e.getSource()==b[4])
           	{s=b[4].getLabel();
           	    if(b[1].getLabel().equals(" "))
                      {b[1].setLabel(s);b[4].setLabel(" ");}
                else if(b[3].getLabel().equals(" "))
                	  {b[3].setLabel(s);b[4].setLabel(" ");}
                	else if(b[5].getLabel().equals(" "))
                	  {b[5].setLabel(s);b[4].setLabel(" ");}
                	else if(b[7].getLabel().equals(" "))
                	  {b[7].setLabel(s);b[4].setLabel(" ");}
            }
            else if(e.getSource()==b[5])
           	{s=b[5].getLabel();
           	    if(b[2].getLabel().equals(" "))
                      {b[2].setLabel(s);b[5].setLabel(" ");}
                else if(b[4].getLabel().equals(" "))
                	  {b[4].setLabel(s);b[5].setLabel(" ");}
                	else if(b[8].getLabel().equals(" "))
                	  {b[8].setLabel(s);b[5].setLabel(" ");}
            }
            else if(e.getSource()==b[6])
           	{s=b[6].getLabel();
           	    if(b[3].getLabel().equals(" "))
                      {b[3].setLabel(s);b[6].setLabel(" ");}
                else if(b[7].getLabel().equals(" "))
                	  {b[7].setLabel(s);b[6].setLabel(" ");}
            }
            else if(e.getSource()==b[7])
           	{s=b[7].getLabel();
           	    if(b[4].getLabel().equals(" "))
                      {b[4].setLabel(s);b[7].setLabel(" ");}
                else if(b[6].getLabel().equals(" "))
                	  {b[6].setLabel(s);b[7].setLabel(" ");}
                	else if(b[8].getLabel().equals(" "))
                	  {b[8].setLabel(s);b[7].setLabel(" ");}
            }
            else if(e.getSource()==b[8])
           	{s=b[8].getLabel();
           	    if(b[5].getLabel().equals(" "))
                      {b[5].setLabel(s);b[8].setLabel(" ");}
                else if(b[7].getLabel().equals(" "))
                	  {b[7].setLabel(s);b[8].setLabel(" ");}
            }
            if(b[0].getLabel().equals("1")&&b[1].getLabel().equals("2")&&b[2].getLabel().equals("3")&&b[3].getLabel().equals("4")&&b[4].getLabel().equals("5")&&b[5].getLabel().equals("6")&&b[6].getLabel().equals("7")&&b[7].getLabel().equals("8")&&b[8].getLabel().equals(" "))
            JOptionPane.showMessageDialog(Puzzle.this,"you won");          	
        }
	public static void main(String s[])
	{
		new Puzzle();
	}
}