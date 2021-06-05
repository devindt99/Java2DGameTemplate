package pkg.models;

import pkg.Handler;
import pkg.SpriteSheet;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * @author Zack (RealTutsGML), Devin
 */
public abstract class GameObject { //Simple superclass for all game objects

    //data fields shared by all GameObjects
    protected int x, y, anim;
    protected float velX = 0, velY = 0;
    protected Handler handler;
    protected SpriteSheet ss;

    /**
     * Argumented constructor for GameObjects, defining important params that they all share
     *
     * @param int x, int y, ID id, Handler handler, Spritesheet ss
     */
    public GameObject(int x, int y, Handler handler, SpriteSheet ss) {
        this.x = x;
        this.y = y;
        this.ss = ss;
    }

    public abstract void tick();

    public abstract void animation(Graphics g);

    public abstract void render(Graphics g);

    public abstract Rectangle getBounds();

    public abstract Rectangle getTopBounds();

    public abstract Rectangle getBotBounds();

    public abstract Rectangle getLeftBounds();

    public abstract Rectangle getRightBounds();

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
