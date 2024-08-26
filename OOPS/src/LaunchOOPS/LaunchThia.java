package LaunchOOPS;
class Emp
{
	int id;
	String name;
	
	
	Emp(){
		System.out.println("zero param constructor");
	}
	
	Emp(int id,String name){
		this();
		this.id = id;
		this.name = name;
		
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
}

public class LaunchThia {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.display();
		Emp e2 = new Emp(1,"Roopan");
		e2.display();
	}

}
