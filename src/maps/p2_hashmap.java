package maps;

import java.util.HashMap;
import java.util.Map;

class Book
{
	int id;
	String name;
	int price;
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	
}

public class p2_hashmap {

	public static void main(String[] args) {
		
		Book b1= new Book(101,"C language",2000);
		Book b2= new Book(102,"C++ language",3000);
		Book b3= new Book(103,"java language",4000);
		
		
		HashMap<Integer, Book> m1= new HashMap<>();
		
		m1.put(1, b1);
		m1.put(2, b2);
		m1.put(3, b3);
		
		
		for(Map.Entry<Integer, Book> i:m1.entrySet())
		{
			int k =i.getKey();
			Book b= i.getValue();
			System.out.println("key : "+ k);
			System.out.println(b.id+"  "+b.name+"  "+b.price);
		
			//System.out.println(i.getKey()+"  "+i.getValue());
	
	}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
