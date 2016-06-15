package element;

import java.awt.Image;

import javax.swing.text.View;
import aedt.showboard.ISquare;

public abstract class Element implements ISquare {
	private Sprite				sprite;
	protected static Permeability	permeability;

	public Element(final Sprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public Sprite getSprite() {
		return this.sprite;
	}

	private void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}

	public Permeability getPermeability() {
		return this.permeability;
	}

	private void setPermeability(final Permeability permeability) {
		this.permeability = permeability;
	}
	public Image getImage() {
		return this.getSprite().getImage();
	}
}
