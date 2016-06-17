package elements_fixes;

import element.Permeability;
import element.Sprite_bis;

class Gate_closed extends element_fixe {

	public Gate_closed() {
		super(new Sprite_bis("images/Gate_closed.png"), Permeability.PENETRABLE, 'X');
	}

}