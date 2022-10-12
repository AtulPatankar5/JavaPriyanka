package Logical;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner(System.in);
		System.out.println("enter the value=");
		int num= sca.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			int prod=num*i;
			System.out.println(num+"X"+ i +"="+ prod);
		}
			
	}

}
