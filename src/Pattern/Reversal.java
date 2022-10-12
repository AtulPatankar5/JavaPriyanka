package Pattern;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner( System.in);
int num= sc.nextInt();

while( num!=0)
{
	System.out.print(num%10);
	num= num/10;
}

	}
	
	

}
