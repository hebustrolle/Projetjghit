package elements_fixes;

public abstract class elements_fixes {
	public static final Bone			Bone				= new Bone();
	public static final Horizontal_bone	Horizontal_bone		= new Horizontal_bone();
	public static final Vertical_bone	Vertical_bone		= new Vertical_bone();
	public static final Gate_closed		Gate_closed			= new Gate_closed();
	public static final Gate_open		Gate_open			= new Gate_open();
	public static final Purse			Purse				= new Purse();
	public static final Crystall_ball	Crystal_ball		= new Crystall_ball();

	private static element_fixe			elements_fixes[]	= { Bone, Horizontal_bone, Vertical_bone, Gate_closed, Gate_open, Purse, Crystal_ball };

	public static element_fixe getFromFileSymbol(final char fileSymbol) {
		for (final element_fixe element_fixe : elements_fixes) {
			if (element_fixe.getFileSymbol() == fileSymbol) {
				return element_fixe;
			}
		}
		return null;
	}
}