package Main;

import Service.Ekart;

public class LaunchDelivery {

	public static void main(String[] args) {
		AmazonProductDelivery apd = new AmazonProductDelivery();
		
		apd.setDelivery(new Ekart());
		Boolean status = apd.deliverTheProduct(700.00);
		if(status)
			System.out.println("Product Delivered Sucessfully");
		else
			System.out.println("Failed to deliver the product");
		
		

	}

}
