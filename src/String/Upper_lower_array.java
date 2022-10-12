package String;

import java.util.Scanner;

class Upper_lower_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Character");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
				System.out.println(ch[i]);
			}
			else if (ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
				System.out.println(ch[i]);
			}
		}
		st= new String(ch);
		System.out.println("the converted string is="+st);
	}

}
