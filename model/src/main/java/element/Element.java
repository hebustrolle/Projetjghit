package element;

import java.awt.Image;

import javax.swing.text.View;
import aedt.showboard.ISquare;

public abstract class Element implements ISquare {
	private Sprite_bis				sprite;
	protected static Permeability	permeability;

	public Element(final Sprite_bis sprite, final Permeability permeability) {
		this.setSprite_bis(sprite);
		this.setPermeability(permeability);
	}

	public Sprite_bis getSprite() {
		return this.sprite;
	}

	private void setSprite_bis(final Sprite_bis sprite) {
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
