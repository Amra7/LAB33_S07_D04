package Vjezbe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Circle {

	private int x;
	private int y;
	private int radius;
	private boolean isFilled;
	private Color color;
	private int speedX;
	private int speedY;
	private Dimension windowDim;
	private int centarX;
	private int centarY;
	private int halfRadius;
	

	public Circle(int x, int y, int radius, boolean isFilled, Color color,
			int speedX, int speedY, Dimension windowDim) {
		
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.isFilled = isFilled;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		this.windowDim = windowDim;
		centarX = x + radius/2;
		centarY = y + radius/2;
		halfRadius = radius / 2;

	}

	public void draw(Graphics g) {

		move();

		x += speedX;
		y += speedY;

		g.setColor(this.color);
		if (isFilled == true) {
			g.fillOval(this.x, this.y, this.radius, this.radius);
		} else if (isFilled == false) {
			g.drawOval(this.x, this.y, this.radius, this.radius);
		}
	}

	private void move() {
		
		if( x < 0 || x + radius >= windowDim.getWidth())
			speedX *= (-1);
		
		// 24 je razlika izmedju frame i panela
		
		if ( y < 0 || y + radius+24 >= windowDim.getHeight())
			speedY *= (-1);
		
		x += speedX;
		y += speedY;
	}
	
	public void checkColision( Circle other){

		int distance = Math.sqrt( Math.pow(this.x, this.y) + Math.pow(other.x, other.y));
		
	}
	
// end of class
}
