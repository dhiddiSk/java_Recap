package oops;

public class Dog extends Animal{

	public Dog(int age, String animalName, int animalWeight, boolean tail) {
		super(age, animalName, animalWeight);
	}

	public static void main(String[] args) {
		System.out.println("This is the method from Dog class");
	}

	public void brak() {
		System.out.println("The dog is barking");
	}

}
