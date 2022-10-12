package OOPS;

class NullPointexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x= null;
		try
		{
			System.out.println(x.equals("apple"));// comparing the null wrt a string ("Apple")
			// Exception causing statement
			
		}
		catch(NullPointerException e)
		{
			System.out.println("null point exception handled");
		}
	}

}
