package CardealerShip;

public class Customer {
	String CustomerName;
	int CustomerAge;
	String CustomerCity;
	int CustomerPhoneNumber;
	
	public Customer(String customerName, int customerAge, String customerCity, int customerPhoneNumber) {
		super();
		CustomerName = customerName;
		CustomerAge = customerAge;
		CustomerCity = customerCity;
		CustomerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCustomerAge() {
		return CustomerAge;
	}
	public void setCustomerAge(int customerAge) {
		CustomerAge = customerAge;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}
	public int getCustomerPhoneNumber() {
		return CustomerPhoneNumber;
	}
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		CustomerPhoneNumber = customerPhoneNumber;
	}
	public void purchaseCar(Employee employee, Vehicle vehicle, boolean finance) {
		System.out.println("The customer "+getCustomerName()+" has purchased the "+vehicle+"from "+ employee+" and the status of finance is "+finance);
	
	// here write an if,else statement with some conditions on how to handle the customer vehicle purchase
	
	
	}
	
}
