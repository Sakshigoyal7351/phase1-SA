package inheritance;


class f1
{
	public void m1()
	{
		System.out.println("this father method");
	}
}

class s1 extends f1
{
	public void m2()
	{
		System.out.println("this s1 method");
	}
}

class s2 extends f1
{
	public void m3()
	{
		System.out.println("this is s2 method");
	}
}


public class hierarchical_inheritance {

	public static void main(String[] args) {
		
		s1 obj= new s1();
		obj.m2();
		obj.m1();
		
		s2 obj2 = new s2();
		obj2.m3();
		obj2.m1();

	}

}
