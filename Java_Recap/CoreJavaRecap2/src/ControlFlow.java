
public class ControlFlow {

	public static void main(String[] args) {
		
		boolean isPersonPresent = true;
		boolean isPersonSleeping = true;
		String switchKey = "true";
		if(isPersonPresent) {
			System.out.println("yes the person is present");
		}else if (!isPersonSleeping) {
			System.out.println("yes the person is not sleeping");
		}else {
			System.out.println("No the person is not present");
		}
		
		switch (switchKey) {
		case "true": {
			System.out.println("Yeah the switch key is true");
			break;
		}
		case "false": {
			System.out.println("Yeah the switch key is false");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + switchKey);
		}
		
		
		
	}

}
