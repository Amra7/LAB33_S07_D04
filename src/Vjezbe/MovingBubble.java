package Vjezbe;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingBubble extends JPanel implements ActionListener{
	
	int frame = 0;
	int frameStreet = 0;
	
 public static void main(String[] args) {
	
	 JFrame  frame =  new JFrame();
	 frame.setSize(500, 500);
	 frame.setLocation(400, 400);
	 
	 MovingBubble mb= new MovingBubble();
	 frame.setContentPane(mb);
	 
	 Timer t = new Timer(1000/25, mb);
	 t.start();
	 
	 Timer t2 = new Timer(1000/100, mb);
	 t2.start();
	 
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setVisible(true);
	 
}
 
     public void paintComponent(Graphics g){
    	 super.paintComponent(g);
    	 g.fillOval(50+frame, 50+frame, 60, 60);
    	 otherPaint(g);
    	 streetLines(g);
     }
     
     public void otherPaint (Graphics g){
    	 g.fillOval(450-frame, 50+frame, 60, 60);
     }
     
     public void streetLines(Graphics g){
    	 g.drawRect(20, 0+frameStreet, 10, 60);
    	 g.drawRect(20, 80+frameStreet, 10, 60);
    	 g.drawRect(20, 160+frameStreet, 10, 60);
    	 g.drawRect(20, 240+frameStreet, 10, 60);
    	 g.drawRect(20, 320+frameStreet, 10, 60);
    	 g.drawRect(20, 400+frameStreet, 10, 60);
    	 g.drawRect(20, 480+frameStreet, 10, 60);
    	 
     }

	@Override
	public void actionPerformed(ActionEvent e) {
		frameStreet+=2;
		frame++;
		repaint();
		
	}
	
     
	// end of class
}
