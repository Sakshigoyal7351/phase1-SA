package reference_variables;

class test3
{
	test3()
	{
		System.out.println("no arg constructor");
	}
	
	test3(int a)
	{
		this();
		System.out.println("parametrised constructor "+a);
	}
}

public class this3 {

	public static void main(String[] args) {
		
		test3 obj= new test3(90);
		
		
		}

}
