package Practice;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int rev=0;
		int temp=num;
		while(num!=0)
		{
		int rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
		
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not a pallindrome ");
		}
	}

}
