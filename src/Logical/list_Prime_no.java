package Logical;

import java.util.Iterator;
import java.util.Scanner;

class list_Prime_no {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter number 1 ");
		int num1= sc.nextInt();
		System.out.println("enter number 2 ");
		int num2= sc.nextInt();
		
		System.out.println("the Prime num=");
		for(int i=num1; i<=num2;i++)
		{
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
	}
	
	public static Boolean isPrime(int num) {
		int count =0;
		for(int i=1; i<=num;i++)
		{
			
			if(num%i==0)
			{
				count ++;
				
			}
			
		}

		if (count==2)
		{
			return true;
		}
		
			else
			{
				return false;
			}
			
	}

}
