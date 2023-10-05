package Exception_handling;

public class p2 {

	public static void main(String[] args) {
		
		try
		{
		int a[] = {1,3,5,7};
		System.out.println(a[10]);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
//			System.out.println("exception in the code");
			
			
//		System.out.println(e);
//		System.out.println(e.toString());
//		System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
