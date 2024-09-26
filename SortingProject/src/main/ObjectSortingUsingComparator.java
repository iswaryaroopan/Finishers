package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
	String name;
	int age;
	double avg;
	
	public Cricketer(String name,int age,double avg) {
		
		this.name = name;
		this.age = age;
		this.avg = avg;
		
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", avg=" + avg + "]";
	}
	
	
}

public class ObjectSortingUsingComparator {

	public static void main(String[] args) {
		
		Cricketer c1 = new Cricketer("Virat", 36, 88.8);
		Cricketer c2= new Cricketer("Rohit", 34, 68.8);
		Cricketer c3= new Cricketer("Dhoni", 39, 78.8);
		
		ArrayList<Cricketer>list=new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		System.out.println(list);
		
		Comparator<Cricketer> c = (o1, o2) -> {
			if(o1.avg>o2.avg)
			return 1;
			else return -1;
			};
		
		
		Collections.sort(list, c);
		System.out.println(list);
		
	}

}
