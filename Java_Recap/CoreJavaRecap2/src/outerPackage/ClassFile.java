package outerPackage;

class Animal {
	String type;
	int age = 4;
	int numberOfLegs;
	String animalName = "Cat";
	
	public void printAnimalName() {
		System.out.println("The name of the animal is "+animalName);
	}
	public void printAnimalAge() {
		System.out.println("The age of the animal is "+age);
	}

}
