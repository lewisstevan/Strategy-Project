package engine.tools;

import java.awt.Point;
import java.util.LinkedList;

/**
 * A point representing a specific location on the map.
 * @author lewis_000
 * @version 1.01
 */
public class MapPoint {
	int x_axis;
	int y_axis;
	
	private static MapPoint pathDistance;
	
	private static LinkedList<MapPoint> pathQueue = new LinkedList<>();
	
	public MapPoint(int x_axis, int y_axis)
	{
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}
	
	public static void createPath(MapPoint currentPoint, MapPoint endPoint)
	{
		pathDistance = new MapPoint(currentPoint.getX() - endPoint.getX(), currentPoint.getY() - endPoint.getY());
		if (pathDistance.getX() == 0 && pathDistance.getY() == 0)
		{
			//Do nothing
		}
		
		else if (pathDistance.getX() >= 0 && pathDistance.getY() >= 0)
		{
			quadrantTwoPath(currentPoint, endPoint);
		}
		
		else if (pathDistance.getX() >= 0 && pathDistance.getY() <= 0)
		{
			quadrantThreePath(currentPoint, endPoint);
		}
		
		else if (pathDistance.getX() <= 0 && pathDistance.getY() >= 0)
		{
			quadrantOnePath(currentPoint, endPoint);
		}
		
		else if (pathDistance.getX() <= 0 && pathDistance.getY() <= 0)
		{
			quadrantFourPath(currentPoint, endPoint);
		}
	}
	
	private static void quadrantOnePath(MapPoint currentPoint, MapPoint endPoint)
	{
		if (MapTile.checkTileOccupied(currentPoint) == true)
	}
	
	private static void quadrantTwoPath(MapPoint start, MapPoint end)
	{
		
	}
	
	private static void quadrantThreePath(MapPoint start, MapPoint end)
	{
		
	}
	
	private static void quadrantFourPath(MapPoint start, MapPoint end)
	{
		
	}
	
	private void set(int x, int y)
	{
		this.x_axis = x;
		this.y_axis = y;
	}
	
	public int getX()
	{
		return x_axis;
	}
	
	public int getY()
	{
		return y_axis;
	}
	
	@Override
	public boolean equals(Object o) {
		
		boolean equality = false;
		
		if (o == this) {
			equality = true;
		}
		
		else if (!(o instanceof MapPoint)){
			equality = false;
		}
		
		else
		{
		MapPoint c = (MapPoint) o;
		
		equality = ((Integer.compare(x_axis, c.getX()) == 0) &&
				(Integer.compare(y_axis, c.getY()) == 0));
		}
		return equality;	
	}
}
