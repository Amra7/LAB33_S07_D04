package Vjezbe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		
		Timer t = new Timer(1000, new TimerHandler());
		t.start();
		Timer t2 = new Timer(2000, new OtherTimerHandler());
		t2.start();
	}
	
	private static class TimerHandler implements ActionListener {
		int counter = 0;

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(counter++);
			
		}
		
	}
	
	private static class OtherTimerHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hello my friend!");
			
		}
		
	}
}
