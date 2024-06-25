package Lambda.demo;

class Account
{
	double amt;
	Account()
	{
		amt = 5000;
	}
	public synchronized void Withdraw(double bal)
	{
		System.out.println(Thread.currentThread().getName()+" "+"Entering ");
		System.out.println(amt);
		if(bal>amt)
		{
		System.out.println("Insufficent Balance");
		}
		else {
			 amt=amt-bal;
		//System.out.println();
		System.out.println(Thread.currentThread().getName()+"amt "+amt);
		}
	}
}
class Client implements Runnable
{
	Account obj;
	Client(Account obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.Withdraw(1000);
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account A1 = new Account();
		
		Runnable obj = new Client(A1);
		
		Thread t1 = new Thread(obj);
		t1.setName("User1 ");
		t1.start();
		
		Thread t2 = new Thread(obj);
		t2.setName("User2 ");
		t2.start();
		
		
		
	}

}
