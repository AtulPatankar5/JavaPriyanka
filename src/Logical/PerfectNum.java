package Logical;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {

		Scanner sc= new Scanner( System.in);
		System.out.println("enter perfect number");
		int num=sc.nextInt();

		int sum=1; // 1 is always divisible 
		int temp=num;// just for comparing the number with summation of factors
		
		for(int i=2; i<=(num/2); i++)
		{
			if (temp%i==0)
			{
			sum= sum+i;
			
			}
		}
		if (sum==num)
		{
			System.out.println("Number is perfect number");
		}
		else
		{
			System.out.println("Number is not a perfect number");
		}
	}

}
