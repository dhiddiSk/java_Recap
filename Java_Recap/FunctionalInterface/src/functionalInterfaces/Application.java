package functionalInterfaces;

public class Application {

	public static void main(String[] args) {
		Robot r = new Robot();
		walking(r);
		
		Human h = new Human();
		walking(h);
		
		ALambdaInterface blockOfCode = () -> {
			System.out.println("hello anonymous");
		};
	}
	
	public static void walking(Walkable w) {
		w.walk();
	}

}
