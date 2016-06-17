package elements_fixes;

import element.Permeability;
import element.Sprite_bis;

class Purse extends element_fixe {

	public Purse() {
		super(new Sprite_bis("images/Purse.png"), Permeability.PENETRABLE, '|');
	}

}