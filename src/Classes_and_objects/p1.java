package Classes_and_objects;
class Fruit
{
	int a=10;
	int b=20;
	
	public void method1()
	{
		System.out.println("hello i am method1");
	}
	
	public void method2()
	{
		System.out.println("hii i am method 2");
	}
}


public class p1 {

	public static void main(String[] args) {
		
		Fruit obj= new Fruit();
		
		System.out.println("a="+obj.a);
		System.out.println("b="+obj.b);
		
		obj.method1();
		obj.method2();
		obj.method1();
		obj.method2();

	}

}
