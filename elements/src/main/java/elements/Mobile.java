package elements;

public class Mobile extends Element{

	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	private int PosX;
	private int PosY;
	private boolean alive = true;
	
	public int getPosX() {
		return PosX;
	}
	
	public void setPosX(int posX) {
		PosX = posX;
	}
	
	public int getPosY() {
		return PosY;
	}
	
	public void setPosY(int posY) {
		PosY = posY;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
