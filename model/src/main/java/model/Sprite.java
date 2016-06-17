package model;

	import java.awt.Image;
	import java.io.File;
	import java.io.IOException;
	import java.io.StringWriter;
	import javax.imageio.ImageIO;
	

	public class Sprite {
		private Image image;
		private int x;
		private int y;
	
		public Sprite(Image  image ,int x , int y) {
			this.x = x;
			this.y = y;
			this.image= image;		
			System.out.println("obj crée");
			System.out.println("x:"+this.x);
			System.out.println("y: "+this.y);
			System.out.println("y: "+this.image);
		}

		

		public Image getImage() {
			return this.image;
		}



		public int getX() {
			System.out.println("x: "+this.x);
			return this.x;
		}



		public int getY() {
			return this.y;
		}
	

	public void setX(int xp) {
		this.x=x+xp;
	}




}
