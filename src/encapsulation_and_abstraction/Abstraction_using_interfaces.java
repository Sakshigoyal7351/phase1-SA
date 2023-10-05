package encapsulation_and_abstraction;

interface ABC
{
	public void show();
}

class V1 implements ABC
{

	
	public void show() {
		
		System.out.println("method 1");
		
	}
	
}

class V2 implements ABC
{

	
	public void show() {
		System.out.println("method 2");
		
	}
	
}




public class Abstraction_using_interfaces {

	public static void main(String[] args) {
		
		V1 obj= new V1();
		obj.show();
		
		V2 obj2= new V2();
		obj2.show();
	}

}
