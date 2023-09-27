package conditional_statements;

public class if_else_if_statement {

	public static void main(String[] args) {
		
		int a=20;
		int b=40;
		int c=45;
		
		if((a>b)&&(a>c))
		{
			System.out.println("a is greater");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is greater");
		}
		else 
		{
			System.out.println("c is greater");
		}

	}

}
