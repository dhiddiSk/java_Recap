package carDealer;

public class HandleCustomer {

	public void HandleCustomerMethod(Customer cust, boolean finance, Vehicle vehicle) {
		
		Customer cust1 = new Customer();
		Vehicle vehicle1 = new Vehicle();
		
		
		if(finance == true){
			runCreditHistory(cust1, vehicle1.vehicleCost);
		}else if(vehicle1.vehicleCost <= cust1.getCashOnHand()) {
			// do something, make proper validation
			// processTransaction(Customer cust, Vehicle vehicle)
		}else {
			// Write a print statement telling as below line
			//tell customer to bring more money.
		}	   	
	}

	private void runCreditHistory(Customer cust2, int vehicleCost) {
		System.out.println("This is used for credit history");
		
	}
}
