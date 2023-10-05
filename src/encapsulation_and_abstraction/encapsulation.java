package encapsulation_and_abstraction;

class E
{
	private int a;
	private String b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	
	
}


public class encapsulation {

	public static void main(String[] args) {
		
		
		E obj= new E();
		obj.setA(10);
		obj.setB("sakshi");
		
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());

	}

}
