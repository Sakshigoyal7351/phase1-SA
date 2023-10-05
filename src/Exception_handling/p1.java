package Exception_handling;

public class p1 {

	public static void main(String[] args) {
		try
		{
		int n = 10;
		int c;
		c=n/0;
		
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("there is an exception... num is divided by zero which is undefiner");
		}

	}

}
