package polymorphism;


class X2
{
	public void m1()
	{
		System.out.println("hello");
	}
	
	public void m1(int a)
	{
		System.out.println("a="+a);
	}
}

class X3
{
	public void m1()
	{
		System.out.println("hello 2");
	}
	
	public void m1(int a)
	{
		System.out.println("a="+a);
	}
}
public class method_overriding {

	public static void main(String[] args) {
		
		X2 obj= new X2();
		obj.m1();
		obj.m1(12);

		X3 obj2= new X3();
		obj2.m1();
		obj2.m1(12);
	}

}
