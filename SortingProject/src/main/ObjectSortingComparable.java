package main;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1>{
	String name;
	int age;
	double avg;
	
	public Cricketer1(String name,int age,double avg) {
		
		this.name = name;
		this.age = age;
		this.avg = avg;
		
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", avg=" + avg + "]";
	}

	@Override
	public int compareTo(Cricketer1 o) {
		if(this.avg>o.avg)
		return 1;
		else return -1;
	}
	
	
}
public class ObjectSortingComparable {

	public static void main(String[] args) {
		Cricketer1 c1 = new Cricketer1("Virat", 36, 88.8);
		Cricketer1 c2= new Cricketer1("Rohit", 34, 68.8);
		Cricketer1 c3= new Cricketer1("Dhoni", 39, 78.8);
		
		ArrayList<Cricketer1>list=new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
