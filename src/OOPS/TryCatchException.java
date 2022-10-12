package OOPS;

import java.util.Scanner;

class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("enter num1:");
		int num1= sc.nextInt()	;
		System.out.println("eter num2:");
		int num2= sc.nextInt()	;
		int res=0;
		try
		{
			res=num1/num2;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled");
		}
	}

}
