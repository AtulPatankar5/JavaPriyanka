package Logical;

import java.util.Scanner;

public class Specialcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=  new Scanner( System.in);
		System.out.println("enter character");
char ch= sc.next().charAt(0);

if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
{
	System.out.println("alphabet");
}
else if (ch>='0' && ch<='9')
{
	System.out.println("number");
}
else
{
System.out.println("character");	
}

	}

}
