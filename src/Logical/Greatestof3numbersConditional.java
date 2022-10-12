package Logical;

import java.util.Scanner;

public class Greatestof3numbersConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=  new Scanner( System.in);
		System.out.println("enter num1");
int num1= sc.nextInt();
System.out.println("enter num2");
int num2= sc.nextInt();
System.out.println("Enter num3");
int num3= sc.nextInt();

System.out.println("the greater num="+largestnumber(num1, num2, num3));
	}
	public static int largestnumber(int num1, int num2, int num3)
	{
		int temp= num1>num2? num1:num2;
		int res=num3>temp? num3:temp;
		return res;
	}
}
