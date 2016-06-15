package elements_fixes;

import element.Permeability;
import element.Sprite;

class Gate_closed extends element_fixe {

	public Gate_closed() {
		super(new Sprite("images/Gate_closed.png"), Permeability.PENETRABLE, 'X');
	}

}