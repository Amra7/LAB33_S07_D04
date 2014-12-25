package Vjezbe;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGeometryAgain extends JPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setLocation(100, 400);
		
		SimpleGeometryAgain sga = new SimpleGeometryAgain();
		frame.setContentPane(sga);
		sga.repaint();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(100, 100, 200, 200);
		paintAgain(g);
	
		
	}
	
	public void paintAgain(Graphics g){
		g.fillOval(20, 100, 100, 200);
	}
	


}
