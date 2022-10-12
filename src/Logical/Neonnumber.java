package Logical;

import java.util.Scanner;

 class Neonnumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner( System.in );
		System.out.println(" enter number ");
		int num= sc.nextInt();
		
		int sum=0;
		int square=num*num;
		while(square!=0)
		{
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(num==sum)
		{
			System.out.println("neon number");
		}
		else {
			System.out.println("not a neon number");
		}
	}

}
