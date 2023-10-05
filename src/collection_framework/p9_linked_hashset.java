package collection_framework;

import java.util.LinkedHashSet;

public class p9_linked_hashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(30);
		s1.add(50);
		s1.add(10);
		
		System.out.println(s1);

	}

}
