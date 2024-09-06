package Main;

import Service.Idelivery;

public class AmazonProductDelivery {

	private Idelivery delivery;

	public void setDelivery(Idelivery delivery) {
		this.delivery = delivery;
	}
	
	Boolean deliverTheProduct(Double amount) {
		
		return delivery.deliverTheProduct(amount);
		
	}
	
	
	
}
