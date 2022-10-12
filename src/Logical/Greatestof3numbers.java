package Logical;

import java.util.Scanner;

public class Greatestof3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=  new Scanner( System.in);
		System.out.println("enter num1");
int num1= sc.nextInt();
System.out.println("enter num2");
int num2= sc.nextInt();
System.out.println("Enter num3");
int num3= sc.nextInt();

if (num1>num2 && num1 > num3)
{
	System.out.println("num1 is greater");
}
else if( num2>num3)
{
	System.out.println("num2 is greater");
}
else 
{
	System.out.println("num3 is greater");
}

	}

}
