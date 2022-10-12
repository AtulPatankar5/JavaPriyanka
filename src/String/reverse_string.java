package String;

import java.util.Scanner;

class reverse_string {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter Sentence");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char t= ch[i];
			ch[i]=ch[ch.length-1-i];// i for shifting the element from nth index
			ch[ch.length-1-i]=t;// Swapping the string
		}
		
		st= new String(ch);
		System.out.println("reverse="+st);
	}

}
