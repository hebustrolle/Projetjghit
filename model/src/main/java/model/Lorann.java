package model;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Lorann {
	
	private int x = 0;
	private int y = 0;
	private Image loo ;
	public Lorann() throws IOException {
		loo = ImageIO.read(new File("sprite/lorann_l.png"));
		//paintComponent(null);
		//graphics.drawImage("sprite/lorann_bl.png", x*100, y*64, 64, 64, this);
		// TODO Auto-generated constructor stub
	}

	protected void paintComponent(final Graphics graphics) throws IOException {
		
		
		
				
				graphics.drawImage(loo, x*10, y*64, 64, 64, (ImageObserver) this);
				
			
		}
	
	
}
