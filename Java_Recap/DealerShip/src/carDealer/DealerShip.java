package carDealer;

public class DealerShip {

	public static void main(String[] args) {
		
		Customer cus = new Customer("ram", "Hyderabad", 5000);
		Vehicle vehicle = new Vehicle();
		Employee emp = new Employee();
		
		cus.purchaseCar(vehicle, emp, true);			
	}
}
