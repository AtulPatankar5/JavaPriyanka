package Conditional;

import java.util.Scanner;

public class Ifdnyamic {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number 1");
		int a=sc.nextInt();
		System.out.println("Enter the number 2");
		int b= sc.nextInt();
		
		if (a>b) {
			System.out.println("number 1 is greater");
			
		}
		else {
		System.out.println("number 2 is greater");
		}
	}

}
