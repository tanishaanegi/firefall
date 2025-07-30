package gameone;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
	public GameFrame() {
		Board board = new Board();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GAME-ONE");
		
		setResizable(false);
		setSize(1250,650);
		setLocationRelativeTo(null);
		add(board);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameFrame();
		
	}

}
