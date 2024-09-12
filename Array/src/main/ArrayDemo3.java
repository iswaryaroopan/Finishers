
package main;

import java.util.Scanner;

public class ArrayDemo3 {

    public static void main(String[] args) {
        
        int schools[][][] = new int[2][][];
        schools[0] = new int[2][3];
        schools[1] = new int[3][2];
        
        Scanner scan = new Scanner(System.in);
        
        //getting input
        for(int i = 0; i < schools.length; i++) {
            System.out.println("Enter school " + (i + 1) + " details:");
            for(int j = 0; j < schools[i].length; j++) {
                System.out.println(" Enter marks for class " + (j + 1) + " students:");
                for(int k = 0; k < schools[i][j].length; k++) {
                    System.out.print("  Student " + (k + 1) + ": ");
                    schools[i][j][k] = scan.nextInt();
                }
            }
        }
        
        //printing output
        for (int i = 0; i < schools.length; i++) {
            System.out.println("School " + (i + 1) + " Details:");
            for (int j = 0; j < schools[i].length; j++) {
                System.out.println(" Class " + (j + 1) + " Students' Marks:");
                for (int k = 0; k < schools[i][j].length; k++) {
                    System.out.println("  Student " + (k + 1) + ": " + schools[i][j][k]);
                }
            }
        }
        
        
    }
}
