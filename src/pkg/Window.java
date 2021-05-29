package pkg;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author Zack (RealTutsGML)
 *
 */
public class Window { //Defines the window in which our game runs
	
public Window(int width, int height, String title, Game game) {
	
	JFrame frame = new JFrame(title);
	frame.setPreferredSize(new Dimension(width, height));
	frame.setMaximumSize(new Dimension(width, height));
	frame.setMinimumSize(new Dimension(width, height));
	
	frame.add(game);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
}
}
