package CollectionsEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetEx {

	// List is ordered - example 5th element can be retrieved
	// Set is not ordered - no i'th element can be retrieved
	// Set is unordered group of "unique" elements - no duplicates
	// List is a ordered or indexed group of elements - duplicates allowed
	// Both Set and List are interfaces 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] d = {"siva", "public,", "static", "final"};
		List c = new ArrayList();
		c.add("p");
		c.add("q");
		c.add("r");
		HashSet<String> hs = new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		hs.addAll(c);
		
		//if ( hs.iterator().equals("r")  ){
			System.out.println(hs.toString());
		//}
	}

}
