package encapsulation_and_abstraction;

abstract  class vehicle
{
	abstract void start();
}

class Car extends vehicle
{

	
	void start() {
		System.out.println("car starts with a key");
		
	}
	
}

class scooter extends vehicle
{

	
	void start() {
		System.out.println("scooter starts with kick");
		
	}
	
}


public class abstraction_using_abstract_class {

	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.start();
		
		scooter obj2= new scooter();
		obj2.start();
		

	}

}
