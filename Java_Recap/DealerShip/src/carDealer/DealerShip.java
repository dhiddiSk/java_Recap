package carDealer;

public class DealerShip {

	public static void main(String[] args) {
		
		Customer cus = new Customer();
		
		cus.setAddress("Hyderabad");
		cus.setName("ram");
		cus.setCashOnHand(500);
		
		Vehicle vehicle = new Vehicle();
		Employee emp = new Employee();
		
		
		cus.purchaseCar(vehicle, emp, false);
		
		
		
		/*
		 * handleCustomer( Customer cust, boolean finance, Vehicle vehicle)
		 * 
		 * if(finance == true)
		 * 		runCreditHistory(Customer cust, double doubleAmount);
		 * else if(vehicle.getPrice() <= cust.getCashOnHand());
		 * 		processTransaction(Customer cust, Vehicle vehicle)
		 * 
		 * else:
		 *  	tell customer to bring more money.
		 */
		
		
		
	}

}
