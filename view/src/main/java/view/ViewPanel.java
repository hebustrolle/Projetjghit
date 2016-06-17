package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Sprite;




/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	public int i = 2;
	public int cpt = 0;
	public int z;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		cpt=0;
		graphics.setColor(Color.BLACK);
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
		graphics.setColor(Color.red);
		graphics.drawString(this.getViewFrame().getModel().getMessage(), 10, 20);
		graphics.drawString(this.getViewFrame().getModel().GetChar(),10,50);
	
		
		
		//this.viewFrame.getModel().getImage(1);
				
		
		
			
		Image image = this.viewFrame.getModel().getImage(1);
		int x = this.viewFrame.getModel().getX(1);
		int y = this.viewFrame.getModel().getY(1);
		graphics.drawImage(image,x*64,y*64, this.getViewFrame());//(image,x*64,y*64, 64, 64, this.getViewFrame());
		this.viewFrame.getModel().setX(x+64);		
		this.repaint();
				//cpt++;
				
		
			
		/*try {
			Thread.sleep(500);
			
			
			
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			*/
		
	
		}
	}
	
