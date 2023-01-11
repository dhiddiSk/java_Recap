package FileProcessingAndExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Take the input from the user keyboard
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter some text here: ");	
//		
//		String enteredText = sc.nextLine();
//		System.out.println(enteredText);
		
		try {
			File file = new File("myTemp.txt");
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not found exception");
		}		
	}
}
