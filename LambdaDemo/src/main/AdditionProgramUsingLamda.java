package main;

interface Add{
	
	public int add(int a, int b);
}

public class AdditionProgramUsingLamda {

	public static void main(String[] args) {
		Add obj = (a ,b) -> {return a+b;};
		int result = obj.add(5, 5);
		System.out.println(result);
	}

}
