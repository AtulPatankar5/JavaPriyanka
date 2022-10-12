package Conditional;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int game =sc.nextInt();
		switch(game)
		{
		case 1: System.out.println("play");
		break;
		case 2 : System.out.println("dance");
		break;
		case 3 : System.out.println(" sing");
		break;
		default : System.out.println(" wrong input");
		}
		
	}

}
