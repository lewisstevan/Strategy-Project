package engine.interfaces;

/**
 * This abstract class will serve as a baseline for any ability
 * that will incorporate both an area of effect and a damage over time
 * or similar effect that lasts more than one turn.
 * @author lewis_000
 * @version 1.01
 */
public abstract class AoEDoTAbility extends AoEAbility {
	/**
	 * Represents how long (in turns) this abilities effect(s) will last.
	 */
	protected int AbilityDuration;
	
	/**
	 * Retrieves the duration of this ability.
	 * @return AbilityDuration the amount of turns ability effect(s) will last.
	 */
	protected int getAbilityDuration()
	{
		return AbilityDuration;
	}
}
