package constructors;

class D
{
	int a, b;
	public D() {
		super();
		System.out.println("hii");
	
	}
	public D(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	
}


public class p3 {

	public static void main(String[] args) {
		
		D obj= new D(20,10);
		
		D obj2= new D();
		

	}

}
