package opeators;

public class shift_operator {

	public static void main(String[] args) {
		int a=2; //0010---> 0100--> 1000---> 8
		
		int c=a<<2;
		
		System.out.println(c);
		
		int b=8;//1000--->0100 ----> 0010--->2
		
		int d=b>>2; //
		
		System.out.println(d);

	}

}
