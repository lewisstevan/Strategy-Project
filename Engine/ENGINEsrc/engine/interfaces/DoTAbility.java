package engine.interfaces;

/**
 * This abstract class will father all abilities who will
 * implement some effect that lasts longer than one turn.
 * @author lewis_000
 * @version 1.01
 */
public abstract class DoTAbility {
	/**
	 * The amount of turns the effect(s) of this ability will last.
	 */
	int AbilityDuration;
	
	/**
	 * Retrieves the amount of turns this abilities effect(s) will last.
	 * @return AbilityDuration the number of turns effect(s) will last.
	 */
	int getAbilityDuration()
	{
		return AbilityDuration;
	}
}
