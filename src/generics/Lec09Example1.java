package generics;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Lec09Example1 {

	public static void main(String[] args) {
		// Create an empty list of Strings

		List<String> slist = new ArrayList<String>();

		// Notice that we are programming to the
		// interface List<> and not to it's 
		// specific implementation.

		// At first the list is empty.
		out("Size of list is: " + slist.size());
		out("Is empty?: " + slist.isEmpty());

		// Add some strings to our list.
		slist.add("Knock, knock");
		slist.add("Who's there?");
		slist.add("Boo");
		slist.add("Boo who?");
		slist.add("Stop crying. It's only a knock-knock joke");

		// Now how large?
		out("Size of list is: " + slist.size());
		out("Is empty?: " + slist.isEmpty());

		// Retrieve by index
		out("0th string: " + slist.get(0));
		out("Last string: " + slist.get(slist.size()-1));

		// Insert a string at a specific index.
		// Everything else slides down.

		out("3rd string before: " + slist.get(2));

		slist.add(2, "New 3rd string");

		out("3rd string after: " + slist.get(2));
		out("4th string after: " + slist.get(3));

		// Remove by index

		slist.remove(2);
		out("3rd string after removal: " + slist.get(2));

		// Can remove by element as well.
		out("Size before: " + slist.size());
		boolean found = slist.remove("Boo");
		if (found) {
			out("String removed");
		} else {
			out("String to be removed not found");
		}
		out("Size after: " + slist.size());
		
		// Convert to an array like so:

		String[] sarray = slist.toArray(new String[slist.size()]);
		out("sarray is: " + Arrays.toString(sarray));
		
	}

	public static void out(String output) {
		System.out.println(output);
	}
}
