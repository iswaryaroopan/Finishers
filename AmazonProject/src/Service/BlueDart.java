package Service;

public class BlueDart implements Idelivery {

	@Override
	public Boolean deliverTheProduct(Double amount) {
		System.out.println("Product delivered via BlueDart , amount paid is "+amount);
		return true;
	}

}
