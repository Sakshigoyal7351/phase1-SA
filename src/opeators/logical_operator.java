package opeators;

public class logical_operator {

	public static void main(String[] args) {
		
		System.out.println("logical AND "+((8>5)&&(8<10)));//t && t-> t
		System.out.println("Logical OR "+((8<5)||(8<10)));//f || t
		System.out.println("Logical Not "+!(8>5));//t
	}

}
