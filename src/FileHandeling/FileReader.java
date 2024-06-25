package FileHandeling;
import java.io.*; 

public class FileReader {

	public FileReader(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  throws IOException{

			FileReader r = new FileReader ("F:\\Core Java Videos\\File Handaling\\demo.txt");
				int i;
				while((i=r.read())!=-1)
				{
				System.out.println((char)i);  // i is printing asky values so we car upcast the method using char.
				}
		}

	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}
}

