package LaunchOOPS;
class Employee{
	String name;
	int age;
	
	Employee(String name, int age){
		this.name= name;
		this.age = age;
		}
}
public class LanuchConstructor {

	public static void main(String[] args) {
		Employee roopan = new Employee("Roopan",31);
		Employee viji = new Employee("viji",28);
		System.out.println(roopan.name);
		System.out.println(roopan.age);
		System.out.println(viji.name);
		System.out.println(viji.age);

	}

}
