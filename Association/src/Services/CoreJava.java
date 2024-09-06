package Services;

public class CoreJava implements Icourse {

	@Override
	public Boolean purchaseCourse(Double amount) {
		System.out.println("CoreJava Course Purchased, the amount paid is "+amount);
		return true;
	}

}
