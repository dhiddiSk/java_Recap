package hashSet;

public class Animal {

	int animalSerialNumber;
	String animalName;
	int numberOfLegsForAnimal;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public Animal(int animalSerialNumber, String animalName, int numberOfLegsForAnimal) {
		super();
		this.animalSerialNumber = animalSerialNumber;
		this.animalName = animalName;
		this.numberOfLegsForAnimal = numberOfLegsForAnimal;
	}
	public int getAnimalSerialNumber() {
		return animalSerialNumber;
	}
	public void setAnimalSerialNumber(int animalSerialNumber) {
		this.animalSerialNumber = animalSerialNumber;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public int getNumberOfLegsForAnimal() {
		return numberOfLegsForAnimal;
	}
	public void setNumberOfLegsForAnimal(int numberOfLegsForAnimal) {
		this.numberOfLegsForAnimal = numberOfLegsForAnimal;
	}	
}
