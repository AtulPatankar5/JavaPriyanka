package Pattern;

import java.util.Scanner;

class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//****
		//***
		//**
		//*
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt()	;
		
		for( int i=1; i<=n;i++)
		{
			for(int j=1; i+j<=(n+1);j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
