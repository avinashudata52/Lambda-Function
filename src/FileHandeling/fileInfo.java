package FileHandeling;

import java.io.File;

public class fileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("F:\\Core Java Videos\\File Handaling\\demo.txt");
		if(f.exists())
		{
			//System.out.println("File created: "+f.createNewFile("F:\\Core Java Videos\\File Handaling\\demo.txt"));
			System.out.println("File Name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File Writeble: "+f.canWrite());
			System.out.println("File Readeble: "+f.canRead());
			System.out.println("File Size: "+f.length()+"kb");
			//System.out.println("File Remove: "+f.delete());
		}
		else
		{
			System.out.println("File doesn't Exists");
		}
	}

}
