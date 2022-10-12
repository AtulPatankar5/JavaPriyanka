package Logical;

import java.util.Scanner;

 class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner( System.in);
		System.out.println(" Enter number 1");
		int  num1= sc.nextInt();
		System.out.println(" Enter number 2");
		int num2= sc.nextInt();
		
		int empty= num1;
		num1=num2;
		num2=empty;
		
		System.out.println("num1="+num1);
		System.out.println("num 2="+ num2);
	}

}
