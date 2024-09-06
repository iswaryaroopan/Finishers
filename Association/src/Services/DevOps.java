package Services;

public class DevOps implements Icourse {

	@Override
	public Boolean purchaseCourse(Double amount) {
		System.out.println("DevOps Course Purchased, the amount paid is "+amount);
		return true;
	}

}
