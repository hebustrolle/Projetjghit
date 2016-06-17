package element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.imageio.ImageIO;

public class Sprite_bis extends StringWriter {
	private Image image;

	public Sprite_bis(final String image) {
		try {
			this.image = ImageIO.read(new File("images/" + image));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public Sprite_bis() {
		this("images/noimage.png");
	}

	public Image getImage() {
		return this.image;
	}
}
