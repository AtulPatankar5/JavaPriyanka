package Logical;

import java.util.Scanner;

class Factors {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the value=");
		int num= sca.nextInt();
		int count =0;
		for( int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				count++;
				
			}
			
		}
		System.out.println("count="+count);
	}
}
