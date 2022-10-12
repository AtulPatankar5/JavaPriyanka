package Logical;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=100;
		System.out.println("Armstrong number netween 100 to 1000");
		int arm;
		
		while( i<1000)// condition 
		{
			arm=ASnumber(i);// method call statement 
			if(arm==i)// condition
			{
				System.out.println(i);
			}
			i++;
					
		}
		
		
	}
	public static int ASnumber(int num)
	{
		int x=0;
		int a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num=num/10;
					
		}
		return a;
	}

}
