package collection_framework;

import java.util.ArrayList;

public class p2_Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> li = new ArrayList<>();
		li.add("sakshi");
		li.add("sneha");
		li.add("sam");
		li.add("john");
		
		System.out.println(li.get(3));
		
		li.set(0, "jonny");
		
		System.out.println(li);

	}

}
