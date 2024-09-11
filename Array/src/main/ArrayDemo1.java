package main;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int marks[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<marks.length;i++) {
			System.out.println("Kindly enter the marks for student "+i);
			marks[i] = scan.nextInt();
			
		}
		
		System.out.print("Marks are : ");
		
		for(int i=0; i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}

	}

}
