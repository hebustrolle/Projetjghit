package elements_fixes;

import element.Permeability;
import element.Sprite_bis;

class Vertical_bone extends element_fixe {

	public Vertical_bone() {
		super(new Sprite_bis("images/Vertical_bone.png"), Permeability.BLOCKING, '|');
	}

}