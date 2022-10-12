package Logical;

import java.util.Scanner;

class numberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca= new Scanner( System.in);
		System.out.println("enter number");
		int num=sca.nextInt();
		int result= countno(num);
		System.out.println("the count of num is="+result);
	}
	public static int countno(int num)// static parameterized method
	{
		int temp= num;
		int count=0;
		
		while(num!=0)
		{
			num=num/10; 
			count++;// to calculate the no.of digit
		}
		return count;
	}
	

}
