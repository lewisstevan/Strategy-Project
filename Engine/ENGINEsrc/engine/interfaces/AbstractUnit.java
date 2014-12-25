package engine.interfaces;

import engine.tools.GameBoard;
import engine.tools.MapPoint;
import engine.tools.MapTile;
import engine.tools.MapTile.Occupant;


/**
 * This abstract class will act an original for all
 * other units in the game.
 * Example: Method to change stats on a unit based on level.
 * @author trent
 * @version 20140821
 */
public abstract class AbstractUnit implements Unit {
	protected GameBoard myCurrentBoard;
	protected MapTile myCurrentTile;
	protected MapPoint myMapPosition;
	
	public MapPoint getPosition()
	{
		return myMapPosition;
	}
	
	public void move(int theXMoveAmount, int theYMoveAmount)
	{
		myCurrentTile = myCurrentBoard.getTile(myMapPosition);
		myCurrentTile.setStaticOccupant(Occupant.NONE);
		if (myCurrentBoard.getTile(new MapPoint(myMapPosition.getX() + theXMoveAmount, myMapPosition.getY() + theYMoveAmount)).getOccupantType() != Occupant.NONE)
		{
			System.out.println("The unit cannot move here, this tile is occupied");
		}
		else
		{
			myMapPosition = new MapPoint(myMapPosition.getX() + theXMoveAmount, myMapPosition.getY() + theYMoveAmount);
			myCurrentTile = myCurrentBoard.getTile(myMapPosition);
			myCurrentTile.setUnitOccupant(this);
		}
		
	}
	
	public GameBoard getBoard()
	{
		return myCurrentBoard;
	}
}
