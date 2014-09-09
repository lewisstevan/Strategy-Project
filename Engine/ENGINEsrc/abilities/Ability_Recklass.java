package abilities;

import engine.interfaces.AoEAbility;
import engine.tools.MapPoint;
import gui.StartMenu;

/**
 * Causes all units (even allies) within a 2 square radius 
 * to attack him using their basic attacks. 
 * Then moves to each one in order and counter attacks each.
 * @author lewis_000
 * @version 1.01
 */
public class Ability_Recklass extends AoEAbility 
{
	
	public Ability_Recklass()
	{
		super.TurnCost = 3;
		super.EffectRadius = 2;
	}
	
	@Override
	public void activate(MapPoint playerTarget) {
		// TODO Auto-generated method stub
		
	}
}
