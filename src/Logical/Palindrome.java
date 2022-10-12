package Logical;

import java.util.Scanner;

class Palindrome {

	public static void main(String[] args) {


		Scanner sc= new Scanner( System.in );
		System.out.println(" enter number ");
		int num= sc.nextInt();
		
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("pallindrom");
		}
		else
		{
			System.out.println("not pallindrome");
		}
	}

}