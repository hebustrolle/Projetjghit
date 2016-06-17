package elements_fixes;

import element.Permeability;
import element.Sprite_bis;

class Gate_open extends element_fixe {

	public Gate_open() {
		super(new Sprite_bis("images/Gate_open.png"), Permeability.PENETRABLE, 'X');
	}

}