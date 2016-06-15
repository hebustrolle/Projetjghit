package elements_mobiles;

import java.awt.Point;
import element.Element;
import element.Permeability;
import element.Sprite;

public abstract class element_mobile extends Element implements IPawn {
	private final Point position;

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
	
	private boolean isMovePossible(final int x, final int y) {
		return (this.getWorld().getElement(x, y).getPermeability() != Permeability.BLOCKING);
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
