package Logical;

import java.util.Scanner;

class Divisiblitybetweenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=  new Scanner( System.in);
				System.out.println("enter num1");
		int num1= sc.nextInt();
		System.out.println("enter num2");
		int num2= sc.nextInt();
		
		for(int i=num1; i<=num2; i++)
		{
			if(i%3==0 && i%5==0)
			{System.out.println("number is "+i );
		}
		}
		}

}
