package Lambda.demo;
import javax.tools.DiagnosticCollector;
//package Sample;
class DisplayMsg
{	
		static synchronized void showMsg(String name) 
		{
			try
			{
				Thread.sleep(1000);			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			for(int i=0; i<3; i++)
			{
			System.out.println("Good Afternoon"+" ");
			System.out.println(name);
			}
		}
	}

abstract class MyThread1 implements Runnable
{
	DisplayMsg msg;
	String n;
	Thread t;
	public MyThread1 (DisplayMsg msg, String name)
	{
	//msg=new DisplayMsg();
	this.msg=msg;
	t=new Thread(this, name);
	t.start();
	n=name;
	
	public void run()
	{
		msg.showMsg(n);
	}
	}
}
 class ThreadDemo7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMsg msg1 = new DisplayMsg();
		MyThread1 t1 = new MyThread1(msg1,"ABC");
		MyThread1 t2 = new MyThread1(msg1,"XYZ");
		
	}

}
