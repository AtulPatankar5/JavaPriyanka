package Conditional;
import java.util.Scanner;
class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner( System.in);
		System.out.println("enter starting number");
		int num1= sc.nextInt();
		System.out.println("enter ending number");
		int num2= sc.nextInt();
		
		
		
		int sum=0;
		do {
			sum= sum+num1;
			num1++;
			System.out.println("sum is "+sum);
		}
		
		while(num1<=num2);
		System.out.println("sum="+sum);
	}

}
