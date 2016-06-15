package element;

import java.awt.Image;

import javax.swing.text.View;
import aedt.showboard.ISquare;

public abstract class Element implements ISquare {
	private Sprite				sprite;
	private Permeability	permeability;
	private int		World;

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

	public World getWorld() {
		return this.World;
	}

	public void setWorld(final World World) {
		this.World = World;
	}
	public Image getImage() {
		return this.getSprite().getImage();
	}
}
