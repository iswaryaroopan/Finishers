package LaunchOOPS;

class DemoStatic{
	static int a=10;
	static {
		System.out.println("static block2 :" +a);
	}
	{
		System.out.println("Java Block Executed");
	}
	DemoStatic(){
		System.out.println("Constructor called");
	}
}

public class LaunchStatic1 {
	static {
		System.out.println("static block 1");
	}
	public static void main(String[] args) {
		System.out.println("Main method called");
		DemoStatic d = new DemoStatic();
		

	}

}
