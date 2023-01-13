package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		
//		ArrayList<String> items = new ArrayList<String>();
//		
//		items.add("sai");
//		items.add("krishna");
//		items.add("dhdidi");
//		
//		System.out.println(items.get(2));	
//		ArrayList items = new ArrayList();
//		
//		items.add("sai");
//		items.add(2);
//		items.add("dhdidi");
//		
//		System.out.println(items.get(1));
		
		LinkedList<String> numbers = new LinkedList<String>();
		
		numbers.add("fdf");
		numbers.add("20");
		numbers.add("30");
		numbers.add("45");
		for(String number : numbers) {
			System.out.println(number);
		}
		
		
	}
}
