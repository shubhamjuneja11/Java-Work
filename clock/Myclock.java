import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Myclock extends JPanel implements Runnable

{
	int h,m,s,xh,yh,xm,ym,xs,ys;
	int xc=175,yc=175;
	
	/*public void paint()
	{
		Date d=new Date();
	    h=d.getHours();
	    m=d.getms();
	    s=d.getSeconds();	
	}*/
	Myclock()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{System.out.println("hhgff");
		try
		{while(true)
		{
			Thread.sleep(1000);
			repaint();
		}
		}
		catch(Exception e){}
	}
	public void drawclock(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillOval(xc-150,yc-150,300,300);
		g.setColor(Color.GREEN);
		g.drawString("12", xc, yc-130);
		g.drawString("9",xc-140,yc);
		g.drawString("3",xc+130,yc);
		g.drawString("6", xc, yc+145);
		Date d=new Date();
	    h=d.getHours();
	    m=d.getMinutes();
	    s=d.getSeconds();
	    xs = (int) (Math.cos(s * 3.14f / 30 - 3.14f / 2) * 120 + xc);

	    ys= (int) (Math.sin(s * 3.14f / 30 - 3.14f / 2) * 120 + yc);

	    xm = (int) (Math.cos(m * 3.14f / 30 - 3.14f / 2) * 100 + xc);

	    ym = (int) (Math.sin(m * 3.14f / 30 - 3.14f / 2) * 100 + yc);

	    xh = (int) (Math.cos((h* 30 + m / 2) * 3.14f / 180 - 3.14f / 2) * 80 + xc);

	    yh = (int) (Math.sin((h * 30 + m / 2) * 3.14f / 180 - 3.14f / 2) * 80 + yc);
		                
	}public void paint(Graphics g)
	{
		drawclock(g);
		g.drawLine(xc,yc,xs,ys);
		g.drawLine(xc, yc, xm, ym);
		g.drawLine(xc, yc, xh, yh);
	}
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500,500);
		jf.getContentPane().add(new Myclock());
		jf.setVisible(true);
	}

}

