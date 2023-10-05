package collection_framework;

import java.util.Vector;

public class p6_vectors {

	public static void main(String[] args) {
		
		
		Vector<Integer> v1 = new Vector<>();
		
		v1.add(100);
		v1.add(200);
		v1.add(250);
		v1.addElement(300);
		v1.addElement(500);
		
		System.out.println(v1);
		System.out.println("first element is : "+v1.firstElement());
		System.out.println("last element is : "+v1.lastElement());

	}

}
