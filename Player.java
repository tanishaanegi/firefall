package gameone.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Sprite {
	
	
	public Player() {
		w = 180;
		h = 180;
		x = 25;
		y = 389;
		image = new ImageIcon(Player.class.getResource("player2.gif"));
		
	
	}
	public void move() {
		x=x+speed;
	}
	
	public boolean outOfScreen() {
		return x>1250;
	}
}
