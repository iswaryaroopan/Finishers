package main;

import java.util.Scanner;

public class ArrayDemo2Jagged {

	public static void main(String[] args) {
		int marks[][] = new int[2][];
		marks[0] = new int[2]; 
		marks[1] = new int[3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < marks.length; i++) {

			for (int j = 0; j < marks[i].length; j++) {
				System.out.println("Kindly enter class" + i + " Student " + j + "Mark :");
				marks[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.print("Class " + i + " Students Marks are : ");
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}

	}

}
