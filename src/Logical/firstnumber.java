package Logical;

import java.util.Scanner;

 class firstnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca= new Scanner( System.in);
		System.out.println("enter  number");
		int num=sca.nextInt();
		int result= firstno(num);
		System.out.println("the first num is="+result);
	}
	public static int firstno(int num)
	{
		int temp= num;
		while(temp>=10)
		{
			temp=temp/10; // access the first digit
		}
		return temp;
	}

}
