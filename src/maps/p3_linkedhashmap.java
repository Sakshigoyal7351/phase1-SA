package maps;

import java.util.LinkedHashMap;

public class p3_linkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(101, "one");
		m1.put(102, "two");
		m1.put(103, "three");
		
		System.out.println(m1);
		
		m1.remove(102);
		System.out.println(m1);

	}

}
