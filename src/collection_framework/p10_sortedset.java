package collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;

public class p10_sortedset {

	public static void main(String[] args) {
		
	
		
		SortedSet<Integer> s2 = new TreeSet<>();
		
		s2.add(50);
		s2.add(10);
		s2.add(25);
		s2.add(5);
		s2.add(40);
		System.out.println(s2);
		
		System.out.println(s2.first());
		System.out.println(s2.last());

	}

}
