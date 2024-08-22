package GamePart;

import java.util.Scanner;

public class Player {
int guessedNumber;
int gussingNumber(){
	Scanner s = new Scanner(System.in);
	do {
		System.out.println("Hello Player, Please Guess the Number from 1 to 10");
		guessedNumber = s.nextInt();
		if(guessedNumber<1 || guessedNumber>10) {
			System.out.println("Invalid Number, Please Try Again");
		}
	}while(guessedNumber<1 || guessedNumber>10);
	return guessedNumber;
}
}
