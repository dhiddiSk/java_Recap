package hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Hashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Animal> animal = new HashSet<Animal>();
		
		Animal animal1 = new Animal(12, "temp", 4);
		Animal animal2 = new Animal(12, "temp", 4);
		Animal animal3 = new Animal(14, "temp2", 6);
		Animal animal4 = new Animal(15, "temp3", 7);	
		
		
		
//		for(String str : al) {
//			System.out.println(str);
//		}
		
		System.out.println("This is the hashcode1 "+ animal1.hashCode());
		System.out.println("This is the hashcode2 "+ animal2.hashCode());
	}
}
