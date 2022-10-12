package Pattern;

import java.util.Scanner;

class Fibonacei {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Enter number");
		int number = sn.nextInt();
		
		int n1=0;
		int n2=1;

		if(number==1)
		{
			System.out.println(" "+ n1);
		}
		else if(number==2)
		{
			System.out.println(n1+" "+n2);
		}
		else 
		{
			System.out.println(n1+ " ");
			System.out.println(n2+" ");
			for(int i=1; i<=number; i++)
			{
			
			int n3= n1+n2;
			System.out.println(n3+ " ");
			n1=n2;
			n2=n3;
			}
		
		}
	}

}
