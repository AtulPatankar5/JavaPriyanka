package Practice;

import java.util.Scanner;

 class First_digit_display {

	public static void main(String[] args) {
		Scanner sc= new Scanner( System.in );
		System.out.println(" enter number ");
		int num= sc.nextInt();

		int result=first(num);
		System.out.println("first numerb is "+result);
	}
		
	public static int first(int num) 
	{
		while(num>=10)
		{
			num=num/10;
		}
		return num;
	
	}

}
