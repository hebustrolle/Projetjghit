package elements_fixes;

import element.Permeability;
import element.Sprite;

class Crystall_ball extends element_fixe {

	public Crystall_ball() {
		super(new Sprite("images/Crystall_ball.png"), Permeability.PENETRABLE, 'O');
	}

}