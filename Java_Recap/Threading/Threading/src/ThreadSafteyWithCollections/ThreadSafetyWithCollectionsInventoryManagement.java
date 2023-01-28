package ThreadSafteyWithCollections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafetyWithCollectionsInventoryManagement extends Thread{	

	CopyOnWriteArrayList<Product> purchasedProductList = new CopyOnWriteArrayList<Product>();
	ArrayList<Product> soldProductList = new ArrayList<>();

	
	public void purchasedProductsList() {
		for(int i=0; i<1000; i++) {
			Product prp = new Product(i, "_test_product_"+i);
			purchasedProductList.add(prp);
			System.out.println("ADDED "+ prp);
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void soldProductsList() {
		for(int j=0; j<1000; j++) {
			Product soldProduct = purchasedProductList.get(j);
			System.out.println("PRINTING THE PURCHASED "+ soldProduct);
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

