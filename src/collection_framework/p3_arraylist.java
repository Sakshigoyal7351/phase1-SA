package collection_framework;

import java.util.ArrayList;
import java.util.Collections;

public class p3_arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(20);
		l1.add(25);
		l1.add(12);
		l1.add(5);
		l1.add(50);
		
		
		System.out.println(l1);
		Collections.sort(l1);
		
		System.out.println(l1);
		
		
		
		

	}

}
