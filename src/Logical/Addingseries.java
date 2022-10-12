package Logical;

import java.util.Scanner;

public class Addingseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter Number 1");
		int num1= sc.nextInt();
		System.out.println("enter Number 2");
		int num2= sc.nextInt();
		
		int sum=0;
		for(int i=num1; i<=num2; i++)
		{
			sum= sum+i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("sum="+sum);
	
	}

}
