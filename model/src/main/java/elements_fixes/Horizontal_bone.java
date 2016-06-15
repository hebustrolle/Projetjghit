package elements_fixes;

import element.Permeability;
import element.Sprite;

class Horizontal_bone extends element_fixe {

	public Horizontal_bone() {
		super(new Sprite("images/Horizontal_bone.png"), Permeability.BLOCKING, '|');
	}

}