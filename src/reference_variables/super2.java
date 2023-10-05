package reference_variables;

class s1
{
	void m1()
	{
		System.out.println("i am in class s1");
	}
}

class s2 extends s1
{
	void m1()
	{
		System.out.println("i am in class s2");
	}
	
	void show()
	{
	super.m1();
	}
}



public class super2 {

	public static void main(String[] args) {
		
		s2 obj= new s2();
		obj.show();
	}

}
