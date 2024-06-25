package FileHandeling;

import java.io.File;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("F:\\Core Java Videos\\File Handaling\\demo.txt");
		try
		{
		if(f.createNewFile())
		{
			System.out.println("File Successfully created");
		}
		else
		{
			System.out.println("File Already Exist...");
		}
	}
		catch(IOException e)
		{
			System.out.println("Exception Handeled..");
		}
	}
		

}
