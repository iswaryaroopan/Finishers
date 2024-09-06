package Main;

import Services.CoreJava;
import Services.SpringBoot;

public class LaunchCourse {

	public static void main(String[] args) {
		//RoopanTechnologies rt = new RoopanTechnologies(); // object/instance created for target class
		
		RoopanTechnologies rt = new RoopanTechnologies(new CoreJava()); //service is getting constructor Injection
		
		//setter injection
		rt.setCourse(new SpringBoot()); // service is getting called using  setter injection
		
		Boolean course = rt.buyTheCourse(9000.00);
		
		//business logic
		if(course)
			System.out.println("Course Purchased Successfully");
		else
			System.out.println("Failed to buy the course");

	}

}
