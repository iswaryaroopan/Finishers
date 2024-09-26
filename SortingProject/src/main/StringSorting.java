package main;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorting {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Aditya");
		list.add("Suresh");
		list.add("Roopan");
		list.add("Viji");
		list.add("Muthu");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
