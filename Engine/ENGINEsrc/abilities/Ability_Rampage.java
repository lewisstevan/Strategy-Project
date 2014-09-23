package abilities;

import engine.interfaces.AbstractUnit;
import engine.interfaces.AoEAbility;
import engine.tools.MapPoint;

/**
 * Charges toward a unit, charging through any units in or adjacent to his path, 
 * dealing and taking damage for each one (including allies). 
 * If the target unit is reached it is stunned for 1 turn.
 * @author lewis_000
 * @version 1.01
 */
public class Ability_Rampage extends AoEAbility {

	public Ability_Rampage()
	{
		super.TurnCost = 4;
	}
	
	@Override
	public void activate(AbstractUnit unit, MapPoint playerTarget) {
		// TODO Auto-generated method stub
		
	}

}
