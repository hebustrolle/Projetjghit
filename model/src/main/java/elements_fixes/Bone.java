package elements_fixes;

import element.Permeability;
import element.Sprite_bis;

class Bone extends element_fixe {

	public Bone() {
		super(new Sprite_bis("images/Bone.png"), Permeability.BLOCKING, 'c');
	}
}