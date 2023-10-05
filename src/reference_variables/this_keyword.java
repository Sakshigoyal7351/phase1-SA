package reference_variables;

class test
{
	int i;
	
	void setValues(int i)
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println(i);
	}
}

public class this_keyword {

	public static void main(String[] args) {
		
		test obj= new test();
		obj.setValues(20);
		obj.show();
	}

}
