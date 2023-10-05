package maps;

import java.util.HashMap;
import java.util.Map;

public class p1_hashmap {

	public static void main(String[] args) {
		
//		Map<Integer, String> m1 = new HashMap<>();
		
		HashMap<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "One");
		m1.put(2, "two");
		m1.put(3, "two");
		m1.put(4, "four");
		
		System.out.println(m1);
		
		for(Map.Entry i: m1.entrySet())
		{
			System.out.println(i.getKey()+"  "+i.getValue());
		}
		
		
		
		
		

	}

}
