package Logical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sca = new Scanner(System.in);
		System.out.println("enter the value=");
		int num= sca.nextInt();
		
		
		int fact=1;
		for (int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("fact="+fact);
	}

}
