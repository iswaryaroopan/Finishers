package LaunchOOPS;

class Plane{
	
static void display() {
	System.out.println("I am Parent Plane, Static method");
}


final void print(){
	System.out.println("I am a Parent Plane, Final method");
}


void populate() {
	System.out.println("I am parent Plane, Normal method");
}


}


class FighterPlane extends Plane{
	void populate() {
		System.out.println("I am a fighter Plane, Normal method overridded");
	}
	
	static void display() {
		System.out.println("I am FighterPlane Plane, Static method");
	}
	
	/*
	 * final void print(){ System.out.println("I am a Parent Plane, Final method"); // not allowed
	 * }
	 */
}


public class LaunchInheritance {

	public static void main(String[] args) {
		Plane fp = new FighterPlane();
		Plane p = new Plane();
		
		fp.populate();
		
		p.populate();
		
		fp.display();
		
		p.display();
		
		

	}

}
