package carDealer;

public class Customer {

	private String name;
	private String address;
	private double cashOnHand;
	
	Customer customerObject = new Customer();

	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		HandleCustomer hc = new HandleCustomer();
		hc.HandleCustomerMethod(customerObject, finance, vehicle);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
}
