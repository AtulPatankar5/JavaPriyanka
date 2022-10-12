package Pattern;
//		*
//	   *  *
//	  *  *  *
//	 *  *  *  *
//	  *  *  *
//		*  *
//		  *
import java.util.Scanner;

class upper_and_lower_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("eneter number");
		int a= sc.nextInt()	;
		
		for(int i=1; i<=a;i++)
		{
			for(int j=1;j<=((a+1)/2);j++)
			{
				if(i+j>=a+1)
				{
					System.out.print("* ");
	
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			for(int j=a/2; j<=1;j--)
			{
			
				if(i+j>=a+1)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
		
		
	}

}
