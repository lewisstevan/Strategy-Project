package engine.interfaces;

public abstract class AoEAbility extends Ability {
	protected int EffectRadius;
	
	/**
	 * This method will return the area of effected
	 * radius that the ability "attacks". 
	 * @return
	 */
	protected int getEffectRadius()
	{
		return EffectRadius;
	}
}
