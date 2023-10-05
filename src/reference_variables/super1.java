package reference_variables;

class t1
{
	int a=10;
	
}

class t2 extends t1
{
	int a=20;
	
	void show(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}


public class super1 {

	public static void main(String[] args) {
		t2 obj= new t2();
		obj.show(50);

	}

}
