package OOPS;

import java.io.FileNotFoundException;

class String_index_out_of_bound_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Ayush";
		try
		{
			char ch= name.charAt(14);// exception causing statement 
			System.out.println(ch);	// exception printing statement 
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("there is no index at all...");
		}
		
	}

}
