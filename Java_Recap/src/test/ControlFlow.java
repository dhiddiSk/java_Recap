package test;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Use if else statement, switch statement to check the control flow of the program.
		
		Boolean temp = false;
		
//		if(temp) {
//			System.out.println("Hello this is true");
//		}else {
//			System.out.println("Hello this is false");
//		}
		
		int month = 6;
		String monthString = "";
	
		switch(month){
			case 6: monthString = "January";
				break;	
		}
		System.out.println(monthString);
}
}

