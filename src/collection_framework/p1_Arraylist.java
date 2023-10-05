package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class p1_Arraylist {

	public static void main(String[] args) {
		
//		List<String> li = new ArrayList<>();
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Apple");
		l1.add("banan");
		l1.add("strawbaries");
		l1.add("grapes");
		l1.add("mango");
		
		
//		System.out.println(l1);
		
//		Iterator itr = l1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
		
//		for(String i:l1)
//		{
//			System.out.println(i);
//		}
		
//		ListIterator<String> itr = l1.listIterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
//		for(int i=0;i<l1.size();i++)
//		{
//			System.out.println(l1.get(i));
//		}
		
		
		
		
		l1.forEach(i->{
			System.out.println(i);
		});

	}

}
