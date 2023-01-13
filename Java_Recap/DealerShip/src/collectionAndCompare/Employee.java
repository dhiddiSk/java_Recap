package collectionAndCompare;

public class Employee implements Comparable<Employee>{

	int employeeSalary;
	int employeeNumber;
	int employeeAge;
	
	public Employee(int employeeSalary, int employeeNumber, int employeeAge) {
		super();
		this.employeeSalary = employeeSalary;
		this.employeeNumber = employeeNumber;
		this.employeeAge = employeeAge;
	}
	
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.employeeSalary > o.employeeSalary) {
			return -1;
		}else if(this.employeeSalary < o.employeeSalary){
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [employeeSalary=" + employeeSalary + ", employeeNumber=" + employeeNumber + ", employeeAge="
				+ employeeAge + "]";
	}

	
}
