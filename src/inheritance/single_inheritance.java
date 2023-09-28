package inheritance;

class Father
{
	public void f1()
	{
		System.out.println("father class method");
	}
}

class Son extends Father 
{
	public void s1()
	{
		System.out.println("son class method");
	}
}


public class single_inheritance {

	public static void main(String[] args) {
		
		Son obj = new Son();
		obj.f1();
		obj.s1();
		
		
		Father obj2= new Father();
		obj2.f1();
//		obj2.s1();

	}

}
