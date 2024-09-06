package Service;

public class Ekart implements Idelivery {

	@Override
	public Boolean deliverTheProduct(Double amount) {
		System.out.println("Product delivered via Ekart , amount paid is "+amount);
		return true;
	}

}
