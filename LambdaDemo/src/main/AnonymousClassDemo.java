package main;
class A{
	void display() {
		System.out.println("Inside class A");
	}
}
public class AnonymousClassDemo {

	public static void main(String[] args) {
		A a = new A();
		a.display();
		
		A a1 = new A() {
			void display() {
				System.out.println("Inside AnonymousClassDemo");
			}
		};
		a1.display();

	}

}
