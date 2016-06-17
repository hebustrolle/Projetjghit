package elements_fixes;

import element.Permeability;
import element.Sprite;

class Vertical_bone extends element_fixe {

	public Vertical_bone() {
		super(new Sprite("images/Vertical_bone.png"), Permeability.BLOCKING, '|');
	}

}