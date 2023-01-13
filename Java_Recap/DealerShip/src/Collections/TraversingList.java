package Collections;

import java.util.ArrayList;

public class TraversingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Pig");
		animals.add("Dog");
		animals.add("cat");
		
		for(String value: animals) {
			System.out.println(value);
		}
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(new Vehicle("Duke", "2020", "2"));
		vehicles.add(new Vehicle("Honda", "2021", "3"));
		vehicles.add(new Vehicle("ninja", "2022", "4"));
		
		for(Vehicle temp: vehicles) {
			System.out.println(temp);
		}	
		
	}

}
