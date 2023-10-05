package collection_framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class p5_linkedlist {

	public static void main(String[] args) {
//		List<String> li = new LinkedList<>();

		LinkedList<String> li = new LinkedList<>();
		
		li.add("Delhi");
		li.add("mumbai");
		li.add("hyderabad");
		li.add("chennai");
		
		
		System.out.println(li);
		
//		for(String i: li)
//		{
//			System.out.println(i);
//		}
		
		
		
//		li.remove(1);
//		
//		
//		System.out.println(li);
//		
//		li.removeAll(li);
//		
//		System.out.println(li);
		
		
		
		Iterator itr =li.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
