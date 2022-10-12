package Conditional;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the start range=");
		int start= sc.nextInt();
		System.out.println("enter the end range=");
		int end= sc.nextInt();
		
		int sum=0;
		for(int i=start; i<=end; i++)
		{
			sum= sum+ i;
		}
		System.out.println("sum="+sum);
	}

}
