package main;

abstract class M{
	abstract void print();
}
public class AnonymousWithAbsractClass {

	public static void main(String[] args) {
		M m = new M() { //Anonymous class

			@Override
			void print() {
				System.out.println("Implementation of abstract method using anonymous class");
				
			}
			
		};
		m.print();

	}

}
