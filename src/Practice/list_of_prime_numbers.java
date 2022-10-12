package Practice;

import java.util.Scanner;

public class list_of_prime_numbers {

	private static final String Booleon = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("enter num1");
		int num1= sc.nextInt()	;
		System.out.println("enter num2");
		int num2= sc.nextInt()	;
	
		for(int i=num1; i<=num2;i++)
		{
			if(prime(i))
			{
				System.out.println(i);
			}
		}
			
	}
		
		public static Boolean prime(int num)
		{
		int count=0;
		for(int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
