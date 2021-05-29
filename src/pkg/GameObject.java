package pkg;
import java.awt.Graphics;
import java.awt.Rectangle;
/**
 * @author Zack (RealTutsGML), Devin
 *
 */
public abstract class GameObject { //Simple superclass for all game objects

	//data fields shared by all GameObjects
	protected int x, y, anim;
	protected float velX = 0, velY = 0;
	protected ID id;
	protected Handler handler;
	protected SpriteSheet ss;
	public abstract void tick();
	public abstract void animation(Graphics g);
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	public abstract Rectangle getTopBounds();
	public abstract Rectangle getBotBounds();
	public abstract Rectangle getLeftBounds();
	public abstract Rectangle getRightBounds();
	
	/**
	 * Argumented constructor for GameObjects, defining important params that they all share
	 *@param int x, int y, ID id, Handler handler, Spritesheet ss
	 */
	public GameObject(int x, int y, ID id, Handler handler, SpriteSheet ss) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.ss = ss;
	}
	
	//Setters and getters that apply to all game objects
	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getVelX() {
		return velX;
	}

	public void setVelX(float velX) {
		this.velX = velX;
	}

	public float getVelY() {
		return velY;
	}

	public void setVelY(float velY) {
		this.velY = velY;
	}


	
}
