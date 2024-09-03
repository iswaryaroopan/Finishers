package LaunchOOPS;

class Animal1{
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void running() {
		System.out.println("Animal is Running");
	}
}

class Dog1 extends Animal1{
	public void eat() {
		System.out.println("Dog is eating");
	}
	public void running() {
		System.out.println("Dog is Running");
	}
}

class Tiger1 extends Animal1{
	public void eat() {
		System.out.println("Tiger is eating");
	}
	public void running() {
		System.out.println("Tiger is Running");
	}
}

class RealTimePloyMorphism{
	public void permit(Animal1 animal) {
		animal.eat();
		animal.running();
	}
}

public class LaunchPolymorphism {

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		Tiger1 tiger = new Tiger1();
		RealTimePloyMorphism rp = new RealTimePloyMorphism();
		rp.permit(dog);
		rp.permit(tiger);
	}

}
