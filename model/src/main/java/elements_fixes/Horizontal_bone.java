package elements_fixes;

import element.Permeability;
import element.Sprite_bis;

class Horizontal_bone extends element_fixe {

	public Horizontal_bone() {
		super(new Sprite_bis("images/Horizontal_bone.png"), Permeability.BLOCKING, '|');
	}

}