package reference_variables;

class s5
{
	s5()
	{
		System.out.println("I am in s5 class");
	}
}

class s6 extends s5
{
	s6()
	{
		super();
		System.out.println("I am in s6 class");
	}
}

class s7 extends s6
{
	s7()
	{
		super();
		System.out.println("I am in s7 class");
	}
}

public class super3 {

	public static void main(String[] args) {
		
		s6 obj = new s6();
		
	}

}
