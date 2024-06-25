package FileHandeling;

class A extends Thread
{
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("A method is Alive");
	}
}
class isAlive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A t1 = new A();
		//new A();
		A t2 = new A();
		//new A();
		
		//.System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		System.out.println(t1.isAlive());
		
	}

}
