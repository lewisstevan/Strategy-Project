package abilities;

import engine.interfaces.AbstractUnit;
import engine.interfaces.AoEAbility;
import engine.tools.MapPoint;

/**
 * Attacks all units (including allies) adjacent to this unit with it's 
 * basic attack. Basic attack power will be multiplied by the number of
 * units it is attacking.
 * I.E. I'm surrounded by 9 enemies, this attack will hit each enemy with 
 * 9 times the strength of one normal attack.
 * 
 * Each attacked unit will then counter attack this unit dealing normal
 * attack damage.
 * @author lewis_000
 * @version 1.01
 */
public class Ability_Recklass extends AoEAbility 
{
	/**
	 * Creates a Recklass ability object.
	 */
	public Ability_Recklass()
	{
		super.TurnCost = 3;
		super.EffectRadius = 2;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void activate(AbstractUnit unit, MapPoint playerTarget) {
		//unimplemented methods must be created
		// TODO Auto-generated method stub
		
	}
}
