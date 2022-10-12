package Conditional;

import java.util.Scanner;

class nestedelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the marks ");
		int marks= sc.nextInt();
		
		if(marks<50)
		{
			System.out.println("fail");
		}
		else if (marks>=50 && marks<60)
		{
			System.out.println("grade D");
		}
		else if (marks>=60 && marks<70)
		{
			System.out.println("garde C");
		}
		else if ( marks >=70 && marks <=100)
		{System.out.println("awesome");
		}
		
		else
		{
			System.out.println("enter valid marks");
		}
		
	}

}
