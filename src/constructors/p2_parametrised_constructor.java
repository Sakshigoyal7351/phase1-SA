package constructors;

class C
{
	C()
	{
		System.out.println("hii");
	}
	C(String s)
	{
		System.out.println(s);
	}
}


public class p2_parametrised_constructor {

	public static void main(String[] args) {
		
		C obj= new C("hello world");
		
		C obj2= new C();

	}

}
