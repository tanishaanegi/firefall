package gameone;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import gameone.sprites.Enemy;
import gameone.sprites.Player;

public class Board extends JPanel {
	Timer timer;
	BufferedImage backgroundImage;
	Player player;
	Enemy enemies[] = new Enemy[3];
	public Board() {
		setSize(1250,650);
		loadBackgroundImage();
		player = new Player();
		loadEnemies();
		gameLoop();
		
		bindEvents();
		setFocusable(true);
	}
	
	private void gameOver(Graphics pen) {
		if(player.outOfScreen()) {
			pen.setFont(new Font("Consolas", Font.BOLD,20));
			pen.setColor(Color.RED);
			pen.drawString("GAME WIN :) ", 1250/2, 650/2);
			timer.stop();
			return;
		}
		for(Enemy enemy  : enemies) {
			if(isCollide(enemy)) {
				pen.setFont(new Font("Consolas", Font.BOLD,20));
				pen.setColor(Color.RED);
				pen.drawString("GAME OVER :( ", 1250/2, 650/2);
				timer.stop();
			}
		}
	}
	
	private boolean isCollide(Enemy enemy) {
		int xDistance = Math.abs(player.x - enemy.x);
		int yDistance = Math.abs(player.y - enemy.y);
		int maxH = Math.max(player.h,  enemy.h);
		int maxW = Math.max(player.w,  enemy.w);
		return xDistance <= maxW-140 && yDistance <= maxH-140;
		
	}
	
	private void bindEvents() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				player.speed=0;
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				player.speed=7;
				}
				else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.speed=-7;
				}
			}
		}); 
	}
	
	private void loadEnemies() {
		int x = 300;
		int gap = 250;
		int speed = 5;
		for(int i=0;i<enemies.length;i++) {
			enemies[i] = new Enemy(x,speed);
			x=x+gap;
			speed = speed+5;
		}
	}
	
	private void gameLoop() {
		timer = new Timer(50,(e)->repaint());
		
		timer.start();

	}
	private void loadBackgroundImage() {
		try {
			backgroundImage=ImageIO.read(Board.class.getResource("game-bg.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Background image not found...");
			System.exit(1);
			e.printStackTrace();
		}
	}
	
	private void printEnemies(Graphics pen) {
		for(Enemy enemy : enemies) {
			enemy.draw(pen);
			enemy.move();
		}
	}
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		pen.drawImage(backgroundImage,0,0,1250,650,null);
		player.draw(pen);
		player.move();
		printEnemies(pen);
		gameOver(pen);
	}
	

}
