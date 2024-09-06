package Main;

import Services.Icourse;

public class RoopanTechnologies { // target Class

	//declare the interface (Icourse service) as we are giving services to students/working professionals
	private Icourse course;

	//setting the course via constructor
	public RoopanTechnologies(Icourse course) {
		this.course = course;
	}
	
	public RoopanTechnologies() {
		
	}
	
	//setter method for courses , we can set course from student based on the selection
	public void setCourse(Icourse course) {
		this.course = course;
	}
	
	// new function to purchase the course
	Boolean buyTheCourse(Double amount) {
		return course.purchaseCourse(amount);
	}
	
}
