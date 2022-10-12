package Collection;

import java.util.Iterator;
import java.util.TreeSet;

class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts= new TreeSet(); // Similar kind of data allowed only 
		ts.add(34);
		ts.add(35);
		ts.add(45);
		//ts.add(null); // null not allowed
		System.out.println(ts);
		
		// Removing
		System.out.println(ts.remove(35));
		System.out.println(ts);
		
		//Searching
		System.out.println(ts.contains(34));
//		System.out.println(ts.contains(null)); // not allowed
		
		// accessing using iterator
		Iterator it= ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
