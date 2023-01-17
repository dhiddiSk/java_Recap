package threadingInventoryManagement;

import java.util.ArrayList;
import java.util.List;

/*
 * Here we are going to deal the thread safety with collections.
 * Check how things work when multiple threads accessing the same collections.
 */

public class ThreadSafteyWithCollectionsInventoryManager {
	
	List<Product> soldProductList = new ArrayList<Product>();
	List<Product> purchasedProductList = new ArrayList<Product>();

	public void populateSoldProductList() {
		// Let me populate the products till 100 serial number
		Product prod;
		for(int i=1; i<=100; i++) {
			String productName = "Populated the product with number "+i;
			prod = new Product(i, productName);
			soldProductList.add(prod);
		}
	}
	
	public void displaySoldProductList() {
		int size = soldProductList.size();
		Product prod;
		for(int i=0; i<size; i++) {
			String soldProductName = "The product sold with number "+i;
			prod = new Product(i, soldProductName);
			soldProductList.add(prod);
		}
	}
}
