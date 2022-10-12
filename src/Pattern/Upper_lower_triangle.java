package Pattern;

import java.util.Scanner;

class Upper_lower_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int row=1;row<=n; row++)
		{
			for(int space=1;space<=n-row; space++)
			{
				System.out.print(" ");
			}
			for(int col=1;(2*row)>col;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=n-1;row>=1;row--)
		{
			for(int space=1;space<=(n-row); space++)
			{
				System.out.print(" ");
			}
			for(int col=1;(2*row)>col;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
