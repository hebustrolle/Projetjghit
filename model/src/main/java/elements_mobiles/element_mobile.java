package elements_mobiles;

import java.awt.Point;
import element.Element;
import element.Permeability;
import element.Sprite;

public abstract class element_mobile extends Element {
	private final Point position;
	protected int x;
	protected int y;

	public element_mobile(Sprite sprite) {
		super(sprite, Permeability.BLOCKING);
		this.position = new Point();
	}
	public int getX() {
		return this.position.x;
	}
	public int getY() {
		return this.position.y;
	}
	public Point getPosition() {
		return this.position;
	}
	
	public void setX(int x) {
		this.position.x=x;
	}
	public void setY(int y) {
		this.position.y=y;
	}
	
	private boolean isMovePossible(int x, int y) {
		boolean YorN = true;
		return YorN;
	}
	
	public void moveUp() {
		if (this.isMovePossible(this.getX(), this.getY() - 1)) {
			this.setY(this.getY() - 1);
		}
	}
	public void moveLeft() {
		if (this.isMovePossible(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}
	}
	public void moveDown() {
		if (this.isMovePossible(this.getX(), this.getY() + 1)) {
			this.setY(this.getY() + 1);
		}
	}
	public void moveRight() {
		if (this.isMovePossible(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
	}
}
