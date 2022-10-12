package Collection;

import java.util.HashSet;

class Hashset {

	public static void main(String[] args) {

		HashSet hs= new HashSet	();
		hs.add("OMni");
		hs.add(null);
		hs.add(83);
		hs.add(45.23);
		hs.add('a');
		hs.add(true);
		System.out.println(hs);
		System.out.println(hs.size());
		
		//removing
		System.out.println(hs.remove(83));
		
		//Searching the element 
		System.out.println(hs.contains(83));
		System.out.println(hs.contains(null));
		
		//accessing
		for(Object o:hs)
		{
			System.out.println(o);
		}
		
		}

}
