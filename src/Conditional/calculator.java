package Conditional;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner( System.in);
		System.out.println("enter the num1");
		int num1 = sc.nextInt();
		System.out.println("eneter the num2");
		int num2= sc.nextInt();
		
		System.out.println("Enter the operation to be performed: \n + \n - \n *\n /");
		char operation= sc.next().charAt(0);
		
		switch(operation)
		{
		case '+': 
			{
				int sum= num1 + num2;
				System.out.println("sum"+sum);
			}
			break;

		case '-': 
			{
				int difference= num1 - num2;
				System.out.println("diff"+difference);
			}
			break;	

		case '*': 
			{
				int product= num1 * num2;
				System.out.println("product"+product);
			}
			break;

		case '/': 
			{
				int div= num1 / num2;
				System.out.println("div"+div);
			}
			break;
			default:
			{
				System.out.println("eneter valid data");
			}
		}
	}

}
