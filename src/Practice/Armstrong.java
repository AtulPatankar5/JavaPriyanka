package Practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 153= (1x1x1)+(5x5x5)+(3x3x3)
		
		int i=100;
		System.out.println("Armstrong number between 100 and 1000");
		int arm;
		
		while(i<1000)
		
		{
			arm= ASnumber(i);
					
				if (arm==i)
				{
					System.out.println(i);
				}
				
				i++;	
		}
		
		
	}
	public static int ASnumber(int num)
	{
		int x=0;
		int a=0;
		while(num!=0)
		{
				
		x=num%10;
		a=a+(x*x*x);
		num=num/10;
		
		}
		return a;
		
	}

}
