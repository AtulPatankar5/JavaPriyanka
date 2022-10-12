package Practice;

import java.util.Scanner;

public class Strong_number {

	// 145= 1!+4!+5!= 145
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(Strong(num))
		{
			System.out.println("no. is strong");
		}
		else
		{
			System.out.println("no is not strong");
		}
	}
		public static int factor(int num)
		{
		if(num==0)
		return 1;
		return num*factor(num-1);
		}
		public static Boolean Strong(int num)
		{
			int temp=num;
			int sum=0;
			while (temp!=0)
			{
				int digit=temp%10;
				sum=sum+factor(digit);
				temp=temp/10;
				
			}
			return sum==num;
		}
		
	}


