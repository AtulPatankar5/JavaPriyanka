package Logical;

import java.util.Scanner;

class swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the value a=");
		int a= sca.nextInt();
		System.out.println("enter the value b=");
		int b= sca.nextInt();
		
		int sum= a+b;
		a= sum-a;
		b= sum-a;
		System.out.println("a="+a);
		System.out.println("b="+b);
				
	}

}
