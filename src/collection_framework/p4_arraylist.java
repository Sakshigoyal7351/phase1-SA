package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

class Student 
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}

public class p4_arraylist {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"john",22);
		Student s2 = new Student(102,"sam",23);
		Student s3 = new Student(103,"ronny",25);
		
		
		ArrayList<Student> li = new ArrayList<>();
		
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		
		Iterator itr =li.iterator();
		while(itr.hasNext())
		{
			Student st =(Student)itr.next();
			System.out.println(st.id+"   "+st.name+"   "+st.age);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
