package main;

interface X{ //interface with only one method is called functional interface that is eligible for lambda.
	
	void show();
	
}

public class LamdaDemo1 {

	public static void main(String[] args) {
		X x = new X() {

			@Override
			public void show() {
				System.out.println("show method implementer using normal anonymous class");
				
			}
		
		};
		x.show();
		
		//using lamda -> possible if only one method inside the interface
		X x1 = ()->	System.out.println("show method implementer using Lambda");		
		x1.show();

	}

}
