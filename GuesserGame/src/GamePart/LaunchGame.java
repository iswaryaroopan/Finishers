package GamePart;

public class LaunchGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayer();
		u.compare();
		
	}

}
