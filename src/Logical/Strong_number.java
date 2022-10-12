package Logical;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner( System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		if(isStrong(num))
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("not Strong");
		}
	}
	public static int facto(int num)
	{
		if(num==0)
			return 1;
		return num*facto(num-1);
	}
	public static Boolean isStrong(int num)
	{
		int temp=num;
		int digit=0;
		int sum=-0;
		while(temp!=0)
		{
			digit=temp%10;
			sum=sum+facto(digit);
			temp/=10;
			
		}
		return sum==num;
	}

}
