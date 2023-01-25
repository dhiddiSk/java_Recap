package oops;

public class Animal {
	
	int age;
	String animalName;
	int animalWeight;
	
	public Animal(int age, String animalName, int animalWeight) {
		this.age = age;
		this.animalName = animalName;
		this.animalWeight = animalWeight;
	}

	public void eat() {
		System.out.println("The animal is eating");
	}
	public void drink() {
		System.out.println("The animal is drinking");
	}
}
