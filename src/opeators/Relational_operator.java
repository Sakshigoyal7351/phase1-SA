package opeators;

public class Relational_operator {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		
		System.out.println("a>b="+(a>b));// T
		System.out.println("a<b="+(a<b));//F
		System.out.println("a>=b"+(a>=b));//(a>b)||(a==b) T
		System.out.println("a<=b "+(a<=b));//(a<b)(a==b) f
		System.out.println("a==b "+(a==b));
		System.out.println("a!=b "+(a!=b));
	}

}
