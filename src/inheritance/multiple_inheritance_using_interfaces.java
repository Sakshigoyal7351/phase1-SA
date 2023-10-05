package inheritance;



interface P1
{
	public void m1();
}

interface P2
{
	public void m2();
}

class C1 implements P1, P2
{

	
	public void m2() {
		System.out.println("m2 working ");
	}


	public void m1() {
		
		System.out.println("m1 working ");
	}
	
}


public class multiple_inheritance_using_interfaces {

	public static void main(String[] args) {
		
		C1 obj= new C1();
		obj.m1();
		obj.m2();

	}

}
