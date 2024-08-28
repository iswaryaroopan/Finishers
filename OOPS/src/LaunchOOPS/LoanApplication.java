package LaunchOOPS;

import java.util.Scanner;

class Farmer {
	float pa;
	float td;
	float si;
	static float roi;
	static {
		roi = 10f;
	}
	void accept() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly Provide the required Loan Amount");
		pa = scan.nextFloat();
		System.out.println("Kindly Provide repay Time in months: ");
		td = scan.nextFloat();
	}

	void compute() {
		si = (pa*td*roi)/100;
	}

	void display() {
		System.out.println("Simple Interest is : "+si);
	}
}

public class LoanApplication {

	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		f1.accept();
		f1.compute();
		f1.display();
		
		f2.accept();
		f2.compute();
		f2.display();
		
		f3.accept();
		f3.compute();
		f3.display();
	}

}
