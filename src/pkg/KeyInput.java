package pkg;
import pkg.models.GameObject;
import pkg.models.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * @author Zack (RealTutsGML)
 *
 */
public class KeyInput extends KeyAdapter { //Keeps track of user keystrokes

	Handler handler;
	
	public KeyInput (Handler handler) {
		this.handler = handler;
	}
	
	
	public void keyPressed (KeyEvent e) {
		int key = e.getKeyCode();
		
		for (int i = 0; i < handler.getObjects().size(); i++) {
			GameObject tempObject = handler.getObjects().get(i);
			
			if(tempObject instanceof Player) { //movement controls mapped to keys for Player object
				if (key == KeyEvent.VK_W) handler.setUp(true);
				if (key == KeyEvent.VK_S) handler.setDown(true);
				if (key == KeyEvent.VK_D) handler.setRight(true);
				if (key == KeyEvent.VK_A) handler.setLeft(true);
			}
		}
		
		
	}
	
	public void keyReleased (KeyEvent e) { //key release events immediately stop movement when keys released, for fast, responsive movement
		int key = e.getKeyCode();
		
		for (int i = 0; i < handler.getObjects().size(); i++) {
			GameObject tempObject = handler.getObjects().get(i);
			
			if(tempObject instanceof Player) {
				if (key == KeyEvent.VK_W) handler.setUp(false);
				if (key == KeyEvent.VK_S) handler.setDown(false);
				if (key == KeyEvent.VK_D) handler.setRight(false);
				if (key == KeyEvent.VK_A) handler.setLeft(false);
			}
		}
	}
	
}

