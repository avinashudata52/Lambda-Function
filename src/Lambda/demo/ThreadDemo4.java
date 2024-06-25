package Lambda.demo;

class Myclass1 implements Runnable
{
	public void run()
	{
		Thread t = Thread.currentThread();
		String s = t.getName();
		for(int i=0; i<10; i++)
		{
		System.out.println(i);
		}
	}
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		t1.setName("A");
		t1.setPriority(10);
		
		Thread t2 = new Thread();
		t2.setName("B");
		t2.setPriority(1);
		
		t1.start();
		t2.start();
	}

}
