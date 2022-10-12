package Practice;

import java.util.Scanner;

public class Xylemphloem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1234====>  1+4=5 and 2+3=5
		
		Scanner sc= new Scanner( System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		
		int exsum=0;
		int meansum=0;
		int n=num;
			while(n!=0)
		{
			if(n==num || n<10)
			{
				exsum=exsum+n%10;
			}
			else
			{
				meansum=meansum+n%10;
			}
			n=n/10;
		}
			if(exsum==meansum)
			{
				System.out.println("Xylem");
			}
			else
			{
				System.out.println("Phloem");
			}
		
	}

}
