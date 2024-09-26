package main;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(50);
		list.add(150);
		list.add(25);
		System.out.println("Before Sorting");
		System.out.println(list);
		System.out.println("After Sorting");
		Collections.sort(list);
		System.out.println(list);

	}

}
