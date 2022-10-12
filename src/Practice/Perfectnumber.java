package Practice;

import java.util.Scanner;

class Perfectnumber {

	public static void main(String[] args) {


		Scanner sc= new Scanner( System.in);
		System.out.println("Enter number =");
		int num= sc.nextInt();
		
		int sum=1;
		for(int i=2; i<=num/2;i++)
		{
			if(num%i==0) 
			{
			sum=sum+i;
			}
		}
		if (sum==num)
		{
			System.out.println("it is perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
	
		
		
	}

}
