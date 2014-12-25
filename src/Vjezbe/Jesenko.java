package Vjezbe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Jesenko  extends JPanel implements ActionListener{
	
	Dimension windowSize;
	Circle c1;
	Circle c2;
	
	public Jesenko (Dimension windowSize){
		
	   this.windowSize = windowSize;
	   c1 = new Circle(10,10,50,true, Color.GREEN, 1,3, windowSize);
	   c2 = new Circle(400,20,50,false, Color.magenta,0,1, windowSize);
	   
	}
		
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		c1.checkColision(c2);
		
//		g.setColor(Color.BLUE);
//		g.fillRect(100+frame, 100+frame, 100, 100);
		
		c1.draw(g);
		c2.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	

}
