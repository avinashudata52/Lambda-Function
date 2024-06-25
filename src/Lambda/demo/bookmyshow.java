package Lambda.demo;
class MovieTickets
{
	int AvlbTickcount;
	MovieTickets()
	{
		AvlbTickcount = 100;
	}
	public synchronized void Book(int Ticket)
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(AvlbTickcount);
		if(Ticket <= AvlbTickcount)
		{
			AvlbTickcount = AvlbTickcount - Ticket;
			//System.out.println(AvlbTickcount);
		}
		System.out.println(Thread.currentThread().getName()+""+AvlbTickcount);
	}
}
class User1 implements Runnable
{
	MovieTickets obj;
	
	User1(MovieTickets obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.Book(20);
	}
}
class Bookmyshow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieTickets obj1 = new MovieTickets();
		
		Runnable obj2 = new User1(obj1);
		
		Thread t1 = new Thread(obj2);
		t1.setName("User1 : ");
		t1.start();
		
		Thread t2 = new Thread(obj2);
		t2.setName("User2 :");
		t2.start();
	}

}
