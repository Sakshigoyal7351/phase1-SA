package Exception_handling;

public class p4 {
	
	static void age(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("age should be 18 or 18+");
		}
		else
		{
			System.out.println("Access granted!");
		}
	}

	public static void main(String[] args) {
		
		age(15);

	}

}
