package polymorphism;

class X1
{
	public void m1()
	{
		System.out.println("hello");
	}
	
	public void m1(int a)
	{
		System.out.println("a="+a);
	}
	public void m1(double a)
	{
		System.out.println("a="+a);
	}
	public void m1(int a,double b)
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	public void m1(double b,int a)
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	
}

public class method_overloading {

	public static void main(String[] args) {
		
		X1 obj= new X1();
		obj.m1();
		obj.m1(100);
		obj.m1(2.5);
		obj.m1(10, 20.7);
		obj.m1(3.5, 10);
	}

}
