package Practice;

import java.util.Scanner;

class Number_of_digits {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner( System.in );
		System.out.println(" enter number ");
		int num= sc.nextInt();
				
		int value=Numberd(num);
		System.out.println(" no. of digits="+value);
		
	}
	public static int Numberd(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

}
