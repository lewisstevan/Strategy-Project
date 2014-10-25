package abilities;

import engine.interfaces.AbstractUnit;
import engine.interfaces.AoEAbility;
import engine.tools.MapPoint;

/**
 * Charges toward a selected tile, attacking each unit it passes,
 * damage will be scaled up as the distance of the unit increases.
 * @author lewis_000
 * @version 1.01
 */
public class Ability_Rampage extends AoEAbility {

	/**
	 * Creates a Ability_Rampage object.
	 */
	public Ability_Rampage()
	{
		super.TurnCost = 4;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void activate(AbstractUnit unit, MapPoint playerTarget) {
		// TODO Auto-generated method stub
		
	}

}
