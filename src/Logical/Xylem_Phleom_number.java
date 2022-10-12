package Logical;

import java.util.Scanner;

public class Xylem_Phleom_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner( System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		xylem(num);
		}
	
	public static void xylem(int num)
	{
		int n=num;
		int exsum=0;
		int meansum=0;
		
		while(n!=0)
		{
			if(n==num || n<10)
			{
				exsum=exsum+n%10;
			}
			else
			{
				meansum=meansum+n%10;
			}
			n=n/10;
		}
		if(exsum==meansum)
		{
			System.out.println("Xylem");
		}
		else
		{
			System.out.println("Phloem");
		}
	}
	

}
