package OOPS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Fielreader 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			FileInputStream fi= new FileInputStream("‪C:\\java\\reader.txt");
			try 
			{
				int ch=fi.read();
				while(ch!=-1)
				{
					System.out.println((char)ch);
					ch=fi.read();
				}
			}
		
			catch(IOException e) 
			{
				System.out.println("file completed");
			}

		}
		catch(FileNotFoundException e)
			{	
				System.out.println("file not found");
			}
		}
}


