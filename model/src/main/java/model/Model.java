package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
//import java.nio.channels.SelectionKey;
import java.sql.SQLException;
import java.util.Observable;

import javax.imageio.ImageIO;

import contract.IModel;


/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	/** The message. */
	 private String message ="";
	 private Image img;
	 private int cpt;
	 Sprite sprite[] = new Sprite[64];
	 private int i=0;
	 private int x=0;
	 private int y=0;
	 
	 char[] ch = null;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.message = "";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadMessage(final String key) {
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setMessage(daoHelloWorld.find(key).getMessage());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}
	
	public String GetChar()
	{
		String mot = "CESI ?";
		ch = message.toCharArray();
		
		try {
			sld();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	try {
			img = ImageIO.read(new File("sprite/crystal_ball.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int x=1;
		int y=1;
		sprite[0]= new Sprite(img, x, y);
*/
		
		
			
		
		
		
		//split = new StrToChar(message);
		return mot;	
	}
	
	public void sld() throws IOException
	{	cpt=0;
		//ch = message.toCharArray(); 
		
			
		
		/*for(int y = 0; y < 12; y++)
		{
			for(int x = 0; x < 20; x++)
			{*/
			
				cpt++;
			
		switch('O'/*ch[cpt]*/)
		{
		case 'U': 
			 img = ImageIO.read(new File("sprite/lorann_l.png"));
			 
			 break;
			
		case 'O':
			img = ImageIO.read(new File("sprite/crystal_ball.png"));
			/*if (sprite)
			{
				break;
			}*/
			
			System.out.println("Ecozue");
			sprite[0]= new Sprite(img, x, y);
			i++;
			break;
			
		case 'M':
			img = ImageIO.read(new File("sprite/gate_closed.png"));
			break;
			
		case '|':
			img = ImageIO.read(new File("sprite/vertical_bone.png"));
			break;
			
		case '-':
			 img = ImageIO.read(new File("sprite/horizontal_bone.png"));
			
			break;
		case 'c':
			img = ImageIO.read(new File("sprite/bone.png"));
			break;
			
		case 'E':
			img = ImageIO.read(new File("sprite/monster_1.png"));
			break;
			
		case 'e':
			img = ImageIO.read(new File("sprite/monster_2.png"));			
			break;
			
		case 'B':
			img = ImageIO.read(new File("sprite/monster_3.png"));			
			break;
			
		case 'b':
			img = ImageIO.read(new File("sprite/monster_4.png"));			
			break;
			
		case '$':
			img = ImageIO.read(new File("sprite/purse.png"));			
			break;
			
		case ':':
			img = ImageIO.read(new File("sprite/noimage.jpg"));			
			break;
			
		default :
			img = ImageIO.read(new File("sprite/noimage.jpg"));
			break;
		
		}
		
		//Image img = ImageIO.read(new File("sprite/lorann_l.png"));
		
		
		
		
		}//}}
	public Image getImage(int i){
		System.out.println("image env");
		System.out.println(sprite[0]);
		return sprite[0].getImage();
		
	}
	public int getX(int i){
		System.out.println("x env");
		return sprite[0].getX();
		
	}
	public int getY(int i){
		System.out.println("y env");
		return sprite[0].getY();
		
	}
	public void setX(int xp)
	{
		sprite[0].setX(xp);
	}
		
}
	
