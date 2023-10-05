package multithreading;

class task implements Runnable
{

	@Override
	public void run() {
		
		System.out.println("hii i am in working/running state");
	}
	
}

public class p1 {

	public static void main(String[] args) {
	
		
		task obj = new task();
		
		Thread t1 = new Thread(obj);
		
		t1.start();

	}

}
