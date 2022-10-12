package Pattern;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner( System.in);
		System.out.println("Eneter start range " );
		int num1= sc.nextInt();
		System.out.println("eneter the end range");
		int num2= sc. nextInt();
		
		int count = 0;
		for (int i=num1; i<num2; i++)
		{
			if(i%2==0)
			{
				
			
			System.out.println(i+ " ");
			count++;
			}
		}
		System.out.println("count="+ count);
	}

}
