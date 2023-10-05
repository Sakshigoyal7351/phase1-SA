package multithreading;

class BookMyShow
{
	int total_seats=10;
	
	public void bookseat(int seats)
	{
		synchronized (this) {
			if(total_seats>=seats)
			{
				System.out.println("Seats booked successfully !!");
//				System.out.println("avaliable seats are : "+total_seats);
				total_seats = total_seats-seats;
			}
			else
			{
				System.out.println("seats can not be booked");
				System.out.println("avaliable seats are : "+total_seats);
			}
		}
		
	}
}



public class p4_thread_synchronisation extends Thread{

	int seats;
	
	static BookMyShow b;
	
	public void run()
	{
		b.bookseat(seats);
	}
	
	
	public static void main(String[] args) {
	
	 b= new BookMyShow();
		
	p4_thread_synchronisation sakshi = new p4_thread_synchronisation();
	sakshi.seats=7;sakshi.start();
	
	p4_thread_synchronisation john = new p4_thread_synchronisation();
	john.seats=6;
	john.start();
	
		
		
		
		
		

	}

}
