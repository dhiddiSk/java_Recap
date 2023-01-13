package collectionAndCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(new Employee(1, 2, 3));
		hs.add(new Employee(4, 5, 6));
		hs.add(new Employee(7, 8, 9));
		hs.add(new Employee(10, 11, 12));
		hs.add(new Employee(13, 14, 15));
		
		ArrayList<Employee> al = new ArrayList<Employee>(hs);
		Collections.sort(al);
		System.out.println(al.toString());
	}

}
