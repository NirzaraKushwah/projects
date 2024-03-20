import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{
	JPDemo jp1;
	FDemo()
	{
		super.setTitle("Snake & Ladder");
		jp1=new JPDemo();
		add(jp1);
	}
}
class JPDemo extends JPanel implements ActionListener
{

	Image swt,board,s1,start;
	
		JPDemo()
	{
		setBackground(Color.black);
		img1=new ImageIcon("swt.jpg");
		img2=new ImageIcon("board.jpg");
		img3=new ImageIcon("s1.png");
		img4=new ImageIcon("start.png");
		img5=new ImageIcon("about.gif");
		img6=new ImageIcon("reset.png");
		img7=new ImageIcon("start.gif");
		img8=new ImageIcon("player1.png");
		img9=new ImageIcon("player2.png");
		img10=new ImageIcon("dice9.gif");
		img11=new ImageIcon("dice.png");
}
}
				
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			
			g.drawImage(swt,0,0,this);
			g.drawImage(board,200,0,this);
			g.drawImage(s1,920,0,this);
			g.drawImage(start,20,550,this);
			
			g.drawImage(player1,px1,py1,this);
			g.drawImage(player2,120,620,this);
			
			g.drawImage(player11,10,280,this);
			g.drawImage(player12,10,370,this);
			
			g.drawImage(dice9,10,420,this);
			g.drawImage(dice1,110,430,this);
		 }
}
class Lader
{
	public static void main(String ar[])
	{
	FDemo f=new FDemo();
f.setVisible(true);
f.setBounds(200,100,990,746);	
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}