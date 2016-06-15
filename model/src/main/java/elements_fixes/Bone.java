package elements_fixes;

import element.Permeability;
import element.Sprite;

class Bone extends element_fixe {

	public Bone() {
		super(new Sprite("images/Bone.png"), Permeability.BLOCKING, 'c');
	}

}