package LaunchOOPS;
interface Demo{
	void disp();
	
	default void calc() { // from java 8 , concrete method allowed, with default keyword, it can be either inherited or not..
		
	}
	
	static void mul() { // from java 8 , static method allowed, but should not get inherited
		
	}
}
interface Demo1{
	void show();
}

class Print implements Demo,Demo1{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
//-------------------------------------------------------------

public class LaunchInterface1 {

	public static void main(String[] args) {
		
		Demo p = new Print();
		p.disp();
		//p.show(); //not allowed if we use parent interface ref
		((Print) p).show(); // we can go by down casting.
		
		Print p1 = new Print();
			p1.disp();
			p1.show();
	}

}
