package HashMapLinkedHashMapTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, Integer> dictionary = new HashMap<>();
//		dictionary.put("sai", 10);
//		dictionary.put("krishna", 20);
//		dictionary.put("Dhiddi", 30);
//		
//		for(String word:dictionary.keySet()) {
//			System.out.println((word));
//			
//		}	
		
//		LinkedHashMap<String, Integer> dictionaryOfLinkedHashMap = new LinkedHashMap<>();
//		dictionaryOfLinkedHashMap.put("sai", 10);
//		dictionaryOfLinkedHashMap.put("krishna", 20);
//		dictionaryOfLinkedHashMap.put("Dhiddi", 30);
//		
//		for(String word:dictionaryOfLinkedHashMap.keySet()) {
//			System.out.println(word);
//			
//		}	
		
		TreeMap<String, String> dictionary2 = new TreeMap<>();
		
		dictionary2.put("sai", "s");
		dictionary2.put("krishna", "k");
		dictionary2.put("Dhiddi", "D");
		
		for(String letter:dictionary2.keySet()) {
			System.out.println(letter);
		}
		
		
		
		
		
	}
}
