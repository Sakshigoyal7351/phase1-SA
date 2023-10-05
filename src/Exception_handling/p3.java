package Exception_handling;

public class p3 {

	public static void main(String[] args) {
		
		try
		{
			int a[]= {2,8,9,5};
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("hii i am finally ");
		}

	}

}
