package engine.tools;

import engine.interfaces.AbstractUnit;

public class MapTile {

	private String myLandType;
	private Object myUnit;
	private Occupant myOccupantType;
	
	
	public MapTile()
	{
		myLandType = "Grass";
		myUnit = null;
		myOccupantType = Occupant.NONE;
	}
	
	public AbstractUnit getUnit()
	{
		AbstractUnit result = null;
		if (myUnit.getClass().isInstance(AbstractUnit.class))
		{
			result = (AbstractUnit)myUnit;
		}
		return result;
	}
	
	public String getLandType()
	{
		return myLandType;
	}
	
	public Occupant getOccupantType()
	{
		return myOccupantType;
	}
	
	public void setStaticOccupant(Occupant theObject)
	{
		myUnit = null;
		myOccupantType = theObject;
	}
	
	public void setUnitOccupant(AbstractUnit theUnit)
	{
		if (myOccupantType == Occupant.NONE)
		{
			myOccupantType = Occupant.HERO;
			myUnit = theUnit;
		}
		else
		{
			throw new IllegalStateException();
		}
	}
	
	public enum Occupant
	{
		ROCK, TREE, HERO, BUSH, WALL, RIVER, NONE
	}

}
