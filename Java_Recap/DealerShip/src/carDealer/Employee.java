package carDealer;

public class Employee {

	String employeeName;
	String employeeAddress;
	String employeePhoneNumber;
	
	public void printEmployeeDetails() {
		System.out.println("print the employee details"+ employeeName+" "+ employeeAddress+ " "+ employeePhoneNumber);
	}
	
	public void HandleCustomerMethod(Customer cust, boolean finance, Vehicle vehicle) {
				
		if(finance == true){
			Employee.runCreditHistory(cust, vehicle.vehicleCost);
		}else if(vehicle.vehicleCost <= cust.getCashOnHand()) {
			// do something, make proper validation
			// processTransaction(Customer cust, Vehicle vehicle)
		}else {
			// Write a print statement telling as below line
			//tell customer to bring more money.
			System.out.println("please bring more money");
		}	   	
	}
	
	private static void runCreditHistory(Customer cust1, int vehicleCost) {
		System.out.println("Running the credit history");		
	}
	
}
