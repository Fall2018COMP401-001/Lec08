package generics;

import java.util.HashMap;
import java.util.Map;

public class Lec09Example2 {

	public static void main(String[] args) {
		// Create a map with String keys
		// and Point values.

		Map<String, Point> named_points = new HashMap<String, Point>();

		// Starts out empty.
		out("Size: " + named_points.size());

		// Add some points to our map 
		Point origin = new CartesianPoint(0,0);
		Point point_a = new CartesianPoint(5,5);
		Point a_mirrored = new CartesianPoint(-5, -5);
		Point bubba = new PolarPoint(0.78*Math.PI, 3.2);

		named_points.put("origin", origin);
		named_points.put("Point A", point_a);
		named_points.put("A tnioP", a_mirrored);
		named_points.put("Bubba", bubba);

		out("Size: " + named_points.size());

		// Retrieve by key

		Point p = named_points.get("origin");

		out("origin: " + origin);
		out("Point retrieved with key 'origin': " + p);

		// null if key not in map

		out("A bogus key retrieves: " + named_points.get("bogus"));

		// remove returns associated value if there
		// and then removes the key/value pair

		out("Get bubba: " + named_points.get("bubba"));
		out("Remove bubba: " + named_points.remove("bubba"));
		out("Get bubba now: " + named_points.get("bubba"));

		// Check for key
		out("Is 'Point A' a key?: " + named_points.containsKey("Point A"));
		out("How about 'bubba'?: " + named_points.containsKey("bubba"));

	}

	public static void out(String output) {
		System.out.println(output);
	}

}
