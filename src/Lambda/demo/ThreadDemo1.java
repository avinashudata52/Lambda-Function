package Lambda.demo;

class Sample1 extends Thread
{
	Thread t1 = new Thread();
	public void run()
	{
		System.out.println("This is Thread Demo");
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Sample1 s1 = new Sample1();
		s1.start();
		s1.run();
		
	}

}
