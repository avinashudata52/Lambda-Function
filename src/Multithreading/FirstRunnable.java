package Multithreading;
 
class RunDemo implements Runnable
{
	public void run()
	{	
		//Thread t1 = new Thread.currentThread();
		for(int i=1; i<=5; i++)
		{
		System.out.println("This is Runnable example");
	}
	}
} 
public class FirstRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunDemo d = new RunDemo();
		d.run();
		
		for(int i=0; i<=5; i++)
		{
			System.out.println("This is main class");
		}
		Thread t = new Thread(d);
		t.start();
		
	}

}
