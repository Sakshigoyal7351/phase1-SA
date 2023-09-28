package constructors;

class X
{
	X()
	{
		System.out.println("hello");
	}
	
	X(int a)
	{
		System.out.println("a="+a);
	}
}


public class demo {

	public static void main(String[] args) {

		X obj = new X();
		
		X obj2 = new X(20);

	}

}
