package Vjezbe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SimpleGeometry  extends JPanel implements ActionListener{
	
	int frame = 0;
	
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Neke budalastine");
		myFrame.setLocation(500, 200);
		myFrame.setSize(500, 500);
		
		Jesenko  picaso = new Jesenko(myFrame.getSize());
		myFrame.setContentPane(picaso);
		picaso.repaint();
		
		Timer t = new Timer(30, picaso);
		t.start();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		g.fillOval(50+frame, 50+frame, 50, 50);
		something(g);
		
	}
	
	public void  something(Graphics g1){
		g1.fillRect(100, 100, 100, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame+=5;
		repaint();
		
	}
	
	
}
