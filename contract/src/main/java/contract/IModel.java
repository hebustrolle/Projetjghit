package contract;

import java.awt.Image;
import java.io.IOException;
import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	String getMessage();

	/**
	 * Load the message.
	 *
	 * @param key
	 *          the key
	 */
	void loadMessage(String key);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	
	String GetChar();
	void sld() throws IOException;
	Image getImage(int i);
	int getX(int i);
	int getY(int i);

	void setX(int i);
}
