package Collections;

public class Vehicle {

	String vehicleName;
	String vehicleModel;
	String numberOfVehicleWheels;
	
	public Vehicle(String vehicleName, String vehicleModel, String numberOfVehicleWheels) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleModel = vehicleModel;
		this.numberOfVehicleWheels = numberOfVehicleWheels;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getNumberOfVehicleWheels() {
		return numberOfVehicleWheels;
	}
	public void setNumberOfVehicleWheels(String numberOfVehicleWheels) {
		this.numberOfVehicleWheels = numberOfVehicleWheels;
	}
	
	
	
	
}
