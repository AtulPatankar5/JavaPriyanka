package Collection;

import java.util.HashMap;

class MapHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Atul");
		hm.put(2, "Atul");
		hm.put(2, "KK");
		hm.put(3,null);
		hm.put(4, "Rakesh");
		System.out.println(hm);
		
		
		//removing
		System.out.println(hm.remove(2));
		System.out.println(hm);
		
		//Searching
		System.out.println(hm.containsKey(4));// true
		System.out.println(hm.containsKey(null));//false
		
		//accessing
		System.out.println(hm.get(1));
		
	}

}
