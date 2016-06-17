package elements_fixes;

import element.Permeability;
import element.Sprite_bis;

class Crystall_ball extends element_fixe {

	public Crystall_ball() {
		super(new Sprite_bis("images/Crystall_ball.png"), Permeability.BLOCKING, 'O');
	}

}