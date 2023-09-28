package inheritance;

class GF
{
	public void gf1()
	{
		System.out.println("gf1 executed");
	}
}
class F extends GF
{
	public void f1()
	{
		System.out.println("f1 executed");
	}
}

class S extends F
{
	public void s1()
	{
		System.out.println("s1 executed");
	}
}

public class multilevel_inheritance {

	public static void main(String[] args) {
		

		S obj1 = new S();
		obj1.s1();
		obj1.f1();
		obj1.gf1();
		
		F obj2= new F();
		obj2.f1();
		obj2.gf1();
//		obj2.s1();
		
		GF obj3 = new GF();
		obj3.gf1();
//		obj3.f1();
//		obj3.s1();
		
	}

}
