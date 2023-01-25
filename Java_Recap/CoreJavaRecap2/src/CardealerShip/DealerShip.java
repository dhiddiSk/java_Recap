package CardealerShip;

public class DealerShip{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int CustomerAge  = 28;
		String CustomerCity = "hyderabad";
		String CustomerName = "sai";
		int CustomerPhoneNumber = 996394384;
		Customer cs = new Customer(CustomerName, CustomerAge, CustomerCity, CustomerPhoneNumber );
		Employee em = new Employee();
		Vehicle vh = new Vehicle();
		
		cs.purchaseCar(em, vh, false);
	}

}
