package engine.interfaces;

import engine.tools.MapPoint;

/**
 * This interface will be the layout for Abilities and skills
 * within the game.
 * Example: Method to cast skill/attribute.
 * @author trent && Stevan
 * @version 9/7/2014
 */
public abstract class Ability {
	
	/**
	 * A variable to hold the turn cool down integer.
	 */
	protected int TurnCost;
	
	/**
	 * A variable to hold the damage count of the ability.
	 */
	protected int Damage;
	
	/**
	 * A variable to hold the current cool down count of the ability.
	 */
	protected int CurrentCoolDown;
	
	/**
	 * A variable to hold the range of the ability.
	 */
	protected int Range;
	
	/**
	 * A query of the abilities range.
	 * @return Range the range of this ability.
	 */
	public int getRange()
	{
		return Range;
	}
	
	/**
	 * A query of the abilities damage.
	 * @return Damage the damage this ability will do.
	 */
	public int getDamage()
	{
		return Damage;
	}
	
	/**
	 * A query of the abilities turn cost.
	 * @return TurnCost the amount of time players must wait before
	 * using this ability again.
	 */
	public int getTurnCost()
	{
		return TurnCost;
	}
	
	/**
	 * A query of the abilities current cool down count.
	 * @return CurrentCoolDown the amount of time remaining before players
	 * can use this ability again.
	 */
	public int getCurrentCoolDown()
	{
		return CurrentCoolDown;
	}
	
	/**
	 * The actions this ability will do once selected.
	 * @param playerTarget The selected target of this ability as defined by 
	 * the selected grid's x and y coordinates.
	 */
	public abstract void activate(MapPoint playerTarget);
}
