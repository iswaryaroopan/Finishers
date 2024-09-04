package LaunchOOPS;

abstract class Human{ //we can not create object for an abstract class
	public Human(){   // we can have a constructor method inside the abstract class
		System.out.println("Human obj called");
	}
	abstract void eat(); // we need to declare the class as abstract even if we have one abstract method
	final void drink() { //final class can not be overridden
		System.out.println("Human is drinking");
	}
}

//100% abstraction may or may not be happen (if we use abstract class)
// we should inherit only one class (as java does not support multiple inheritance)

// to overcome these above mentioned issue we need to go for inheritance right.

class Roopan extends Human{

	@Override
	void eat() { //abstract method should get overridden in the child class.
		// TODO Auto-generated method stub
		System.out.println("Human is eating");
		
	}
	
}

class OutputClass{
	void permit(Human human) { // to achieve  Polymorphism using parent type reference
		human.eat();
		human.drink();
	}
}
public class LaunchAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roopan roopan = new Roopan();
		
		OutputClass oc = new OutputClass();
		
		oc.permit(roopan);

	}

}
