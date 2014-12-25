package abilities;

import java.util.LinkedList;

import engine.interfaces.AbstractUnit;
import engine.interfaces.AoEAbility;
import engine.tools.MapPoint;
import engine.tools.MapTile.Occupant;

/**
 * Charges toward a selected tile, attacking each unit it passes,
 * damage will be scaled up as the distance of the unit increases.
 * @author lewis_000
 * @version 1.01
 */
public class Ability_Rampage extends AoEAbility {
	
	private AbstractUnit myUnit;
	private AbstractUnit myEnemey;

	/**
	 * Creates a Ability_Rampage object.
	 */
	public Ability_Rampage(AbstractUnit theUnit)
	{
		super.TurnCost = 4;
		myUnit = theUnit;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void activate(AbstractUnit unit, MapPoint playerTarget) 
	{
		LinkedList<MapPoint> path = MapPoint.createPath(unit.getPosition(), playerTarget, myUnit.getBoard());
		MapPoint currentPoint;
		path.addFirst(unit.getPosition());
		while (!path.isEmpty())
		{
			currentPoint = path.removeFirst();
			checkSurroundings(currentPoint);
		}
	}
	
	private void checkSurroundings(MapPoint theCurrentPoint)
	{
		try
		{
			if (myUnit.getBoard().getTile(new MapPoint(theCurrentPoint.getX(), theCurrentPoint.getY() - 1)).getOccupantType() == Occupant.NONE)
			{
				myEnemey = myUnit.getBoard().getTile(new MapPoint(theCurrentPoint.getX(), theCurrentPoint.getY() - 1)).getUnit();
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Array out of bounds exception encountered");
		}
	}
}
