package reference_variables;

class test2
{
	void display()
	{
		System.out.println("hello");
	}
	
	void show()
	{
		this.display();
	}
}
public class this2 {

	public static void main(String[] args) {
		
		test2 obj = new test2();
		obj.show();
		
	}

}
