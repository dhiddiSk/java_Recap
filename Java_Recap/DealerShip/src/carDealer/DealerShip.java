package carDealer;

public class DealerShip {

	public static void main(String[] args) {
		
		Customer cus = new Customer("ram", "Hyderabad", 500);
		Vehicle vehicle = new Vehicle();
		Employee emp = new Employee();
		
		cus.purchaseCar(vehicle, emp, true);			
	}
}
