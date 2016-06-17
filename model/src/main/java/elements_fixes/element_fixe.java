package elements_fixes;

import element.Element;
import element.Permeability;
import element.Sprite_bis;

abstract class element_fixe extends Element {
	private char fileSymbol;

	public element_fixe(Sprite_bis sprite, Permeability penetrable, char fileSymbol2) {
		super(sprite, permeability);
		this.fileSymbol = fileSymbol;
	}

	public char getFileSymbol() {
		return this.fileSymbol;
	}
}