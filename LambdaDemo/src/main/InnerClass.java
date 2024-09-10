package main;

import main.OutterClass.InnerClassDemo;

class OutterClass{
	

	class InnerClassDemo{
		
		public void display() {
			System.out.println("Inside InnerClassDemo");

		}
	}
}



public class InnerClass {

	public static void main(String[] args) {
		OutterClass out =  new OutterClass();
		InnerClassDemo inner = out.new InnerClassDemo();
		inner.display();
	}

}
