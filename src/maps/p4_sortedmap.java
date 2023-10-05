package maps;

import java.util.TreeMap;

public class p4_sortedmap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> m1 = new TreeMap<>();
		
		m1.put(1, "delhi");
		m1.put(3, "mumbai");
		m1.put(2, "hyderabad");
		m1.put(4, "chennai");
		
		System.out.println(m1);

	}

}
