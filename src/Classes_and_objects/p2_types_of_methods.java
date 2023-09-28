package Classes_and_objects;

class A
{
	public void nanr()
	{
		int a=20;
		int b=10;
		int c;
		c=a+b;
		System.out.println("sum ="+c);
	}
	public int nawr()
	{
		int a=20;
		int b=20;
		int c;
		c=a+b;
		return c;
	}
	
	public void wanr(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum="+c);
	}
	
	public int wawr(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
}


public class p2_types_of_methods {

	public static void main(String[] args) {
		
		A obj = new A();
		
		obj.nanr();
		int d=obj.nawr();
		System.out.println("sum="+d);
		obj.wanr(30, 20);
		int e=obj.wawr(40, 20);
		System.out.println("sum ="+e);
	}

}
