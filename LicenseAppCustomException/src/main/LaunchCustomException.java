package main;

import java.util.Scanner;

class UnderAgeException extends Exception{
	UnderAgeException(String msg){
		super(msg);
	}
	
}

class OverAgeException extends Exception{
	OverAgeException(String msg){
		super(msg);
	}
}

class Applicant{
	int age;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly Enter your age");
		age = scan.nextInt();
		
	}
	public void verify() throws UnderAgeException, OverAgeException {
		if(age>=18 && age<=60) {
			System.out.println("You are Eligble to Apply for License");
		}else if(age<18) {
			UnderAgeException uae = new UnderAgeException("Please Wait.. you are under age");
			System.out.println(uae.getMessage());
			throw uae;
		}else {
			OverAgeException oae = new OverAgeException("You time for applying license is over! please take rest at home");
			System.out.println(oae.getMessage());
			throw oae;
		}
	}
}

class RTO{
	public void initiate() {
		Applicant app = new Applicant();
		try {
			app.input();
			app.verify();
		}catch(UnderAgeException | OverAgeException e) {
			System.out.println("Try Again! ");
			try {
				app.input();
				app.verify();
			}catch(UnderAgeException | OverAgeException e1) {
				try {
					app.input();
					app.verify();
				}catch(UnderAgeException | OverAgeException e2) {
					System.out.println("You are blocked! due to age restriction");
				}
				
			}
			
		}
		
	}
	
	
}

public class LaunchCustomException {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.initiate();

	}

}
