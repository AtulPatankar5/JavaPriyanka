package Pattern;

import java.util.Scanner;

class cross_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Print 1 value");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j || i+j==(n+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
	
			}
			System.out.println();
	}

	}
	}
