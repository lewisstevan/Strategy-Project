package junit.tests;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import engine.tools.MapPoint;

public class MapPointTest {
	MapPoint first;
	MapPoint second;
	LinkedList<MapPoint> testPath;
	LinkedList<MapPoint> finalList;
	
	@Before
	public void setup()
	{
		first = new MapPoint(5, 5);
		second = new MapPoint(9, 1);
		testPath = new LinkedList<>();
		finalList = new LinkedList<>();
		finalList.add(new MapPoint(6, 4));
		testPath = MapPoint.createPath(first, second);
	}
	
	@Test
	public void test() {
		assertEquals("Method MapPoint.createPath did not"
				+ "create the appropriate MapPoint", finalList.remove().toString(), testPath.removeLast());
	}
}