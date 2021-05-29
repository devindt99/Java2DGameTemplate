package pkg;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 * @author Zack (RealTutsGML)
 *
 */
public class Handler { //Handler class holds, updates, and renders game objects

	ArrayList<GameObject> object = new ArrayList<GameObject>();
	
	private boolean up = false, down = false, right = false, left = false;
	
	public ArrayList<GameObject> getObject() { //GameObjects all stored together in ArrayList
		return object;
	}

	public void setObject(ArrayList<GameObject> object) {
		this.object = object;
	}

	//simple methods/setters used with key inputs to control movement in-game
	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	/**
	 * Tick() method is called to update/animate the game. Each execution of tick represents a new frame in the game.
	 * Thus, it is an essential method for all elements of our game that must be updated.
	 * 
	 */
	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
			
			
	}
	/**
	 * Render() is called to draw objects into our game.
	 * @param Graphics g
	 */
	public void render(Graphics g) {
		for(int i = 0;  i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}

	public void addObject(GameObject tempObject) {
		object.add(tempObject);
	}

	public void removeObject(GameObject tempObject) {
		object.remove(tempObject);
	}
}
