package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class p8_hashset {

	public static void main(String[] args) {
		
//		Set<String> s1 = new HashSet<>();
		
		HashSet<String> s1 = new HashSet<>();
		
		HashSet<String> s2 = new HashSet<>();

		s1.add("one");
		s1.add("two");
		s1.add("three");
		s1.add("four");
		s1.add("one");
		
		
		
		System.out.println(s1);
		
//		s1.remove("one");
//		
//		System.out.println(s1);
		
		s2.addAll(s1);
		
		System.out.println(s2);
	}

}
