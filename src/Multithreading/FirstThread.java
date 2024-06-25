package Multithreading;

class Demo extends Thread
{
	public void start()
	{
		System.out.println("Start");
		try
		{
		for(int i=0; i<5; i++)
		{
			Thread.sleep(1000);
			System.out.println("Avinash");
		}
			
		}
		catch(InterruptedException I)
		{
			//System.out.println("Exception Handeled");
		}
	}
}
public class FirstThread {

	public static void main(String[] args) throws InterruptedException {
		Demo d1 = new Demo();
		d1.start();
		
		//Demo d2 = new Demo();
		//d2.start();
		for(int i=0; i<5; i++)
		{
			Thread.sleep(1000);
			System.out.println("Udata");
		}
			System.out.println("Thread Stoped");
	}

}
