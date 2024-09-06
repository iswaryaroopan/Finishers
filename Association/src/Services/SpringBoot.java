package Services;

public class SpringBoot implements Icourse {

	@Override
	public  Boolean purchaseCourse(Double amount) {
		System.out.println("SpringBoot Course Purchased, the amount paid is "+amount);
		return true;
	}

}
