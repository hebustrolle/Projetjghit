package elements_fixes;

import element.Element;
import element.Permeability;
import element.Sprite;

abstract class element_fixe extends Element {
	private final char fileSymbol;

	public element_fixe(Sprite sprite, Permeability penetrable, char fileSymbol2) {
		super(sprite, permeability);
		this.fileSymbol = fileSymbol;
	}

	public char getFileSymbol() {
		return this.fileSymbol;
	}
}