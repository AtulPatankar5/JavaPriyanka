package Practice;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9*9=81 	8+1=9
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int sum=0;
		int square=num*num;
		while(square!=0)
		{
			int rem=square%10;
			sum=sum+rem;
			square =square/10;
		}
		if(sum==num)
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println("not a neon number");
		}
		
	}

}
