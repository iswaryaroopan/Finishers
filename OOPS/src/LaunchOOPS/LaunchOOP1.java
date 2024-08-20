package LaunchOOPS;

class Calc{
	int num1; //instance variable
	int num2;
	
	void sum() {
		num1=10;
		num2=20;
		int res = num1+num2; //local variable
		System.out.println(res);
	}
	
}

public class LaunchOOP1 {

	public static void main(String[] args) {
		Calc c=new Calc();
		c.sum();
	}

}
