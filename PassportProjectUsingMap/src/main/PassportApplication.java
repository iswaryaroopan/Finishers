package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Passport{
	private String name;
	private String city;
	private String country;
	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}
	
	
}
public class PassportApplication {

	public static void main(String[] args) {
		Passport pass1 = new Passport("Roopan", "Srivilliputtur", "India");
		Passport pass2 = new Passport("Ravi", "London", "UK");
		Passport pass3 = new Passport("Mike", "Melbourne", "AUS");
		
		Integer id1 = Integer.valueOf(101);
		Integer id2 = Integer.valueOf(102);
		Integer id3 = Integer.valueOf(103);
		
		HashMap<Integer,Passport>	 hm=new HashMap<>();
	
		hm.put(id1, pass1);
		hm.put(id2, pass2);
		hm.put(id3, pass3);
		
		System.out.println("Passport Application");
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your passport number");
		Integer userInput = scan.nextInt();
		
		//get all entries from HashMap
		Set<Entry<Integer, Passport>> entry=hm.entrySet();
		
		//create iterator for Entry
		Iterator<Entry<Integer, Passport>> itr=entry.iterator();
		Boolean flag = false;
		
		//Traverse Entry via Iterator
		while(itr.hasNext()) {
			//get the key and value of an object
			Entry<Integer, Passport> kv =itr.next();
			
			//get the key from the key value pair
			Integer key = (Integer) kv.getKey();
			
			//check if key is present
			if(key.intValue() == userInput.intValue()) {
				System.out.println(kv.getValue());
				flag = true;
			}
			
		}
	
	if(flag == false) {
		System.out.println("Unable to fetch your passport Information");
	}
		
		
		
		

	}

}
