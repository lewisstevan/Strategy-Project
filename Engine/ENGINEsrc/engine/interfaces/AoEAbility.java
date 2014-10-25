package engine.interfaces;

/**
 * This abstract class will serve as a parent for
 * classes incorporating abilities that have an area of effect
 * associated with them.
 * @author lewis_000
 * @version 1.01
 */
public abstract class AoEAbility extends Ability {
	/**
	 * The radius that this ability will effect once activated.
	 */
	protected int EffectRadius;
	
	/**
	 * Retrieves the area of the abilities effect.
	 * @return EffectRadius the area of the abilities effects.
	 */
	protected int getEffectRadius()
	{
		return EffectRadius;
	}
}
