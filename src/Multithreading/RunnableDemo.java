package Multithreading;

class A implements Runnable
{
	public void run()
	{
		System.out.println("This is Runnable method");
		for (int i=0; i<5; i++)
		{
			System.out.println("Runnable");
		}
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A s = new A();
		
		
		Thread t = new Thread(s);
		t.start();
	}

}
