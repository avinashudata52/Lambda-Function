package Multithreading;

class Bus implements Runnable 
{
		//@overriding
		int avl=2, passenger=1;
		Bus()
		{
			this.passenger=passenger;
		}
		public synchronized void run()
		{
		String name = Thread.currentThread().getName();
		if(avl>=passenger)
		{	
			//String name;
			System.out.println(name+" Regerved seat...!");
			avl=avl-passenger;
		}	
		else
		{
			System.out.println(name +" Sorry seats are not avl");
		}
	}
}
public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus b = new Bus();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("jon");
		t2.setName("Denvar");
		t3.setName("Tokyo");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
