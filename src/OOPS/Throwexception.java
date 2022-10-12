package OOPS;

import java.util.Scanner;

class Throwexception {

	public static void Validate(int Age) {
		
		if(Age>18)
		{
			try
			{
				throw new AgeNotFoundException();
			}
			catch(AgeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Person not eligible to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter age");
		int Age= sc.nextInt()	;
		Validate(Age);
	}

}
