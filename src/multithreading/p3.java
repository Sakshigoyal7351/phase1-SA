package multithreading;

class th1 extends Thread
{
	public void run()
	{
		System.out.println("task 1 by thread 1 is completed !!");
	}
}

class th2 extends Thread
{
	public void run()
	{
		System.out.println("task 2 by thread 2 is completed !!");
	}
}


public class p3 {

	public static void main(String[] args) {

		th1 t1= new th1();
		t1.start();
		
		th2 t2 = new th2();
		t2.start();
		

	}

}
