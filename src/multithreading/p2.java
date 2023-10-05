package multithreading;

class task2 extends Thread
{
	
	public void run()
	{
		System.out.println("hii i am working !!");
	}
	
}


public class p2 {

	public static void main(String[] args) {
		
		task2 t1 = new task2();
		t1.start();
		
		
		task2 t2= new task2();
		t2.start();

	}

}
