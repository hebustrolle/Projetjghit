package elements_fixes;

import element.Permeability;
import element.Sprite;

class Purse extends element_fixe {

	public Purse() {
		super(new Sprite("images/Purse.png"), Permeability.PENETRABLE, '|');
	}

}