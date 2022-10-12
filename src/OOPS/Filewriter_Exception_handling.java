package OOPS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

class Filewriter_Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try 
{

		FileOutputStream fo= new FileOutputStream("C:\\java\\writer.txt");
		PrintWriter fw= new PrintWriter(fo);
		fw.println("Hi hello hiii");
		fw.flush();
		System.out.println("successfull");
		
}
catch (FileNotFoundException e)
{
	System.out.println("file not found");
}
	}

}
