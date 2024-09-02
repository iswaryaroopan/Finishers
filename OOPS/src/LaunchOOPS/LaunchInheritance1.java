package LaunchOOPS;
class Animal{
	static void eat() {
		System.out.println("animal is eating");
	}
}

class Tiger extends Animal{
	
	static void eat() {
		System.out.println("Tiger is eating");
	}
}

public class LaunchInheritance1 {

	public static void main(String[] args) {
		Animal tiger = new Tiger();
		
		tiger.eat(); // method hiding happens while up casting

	}

}
