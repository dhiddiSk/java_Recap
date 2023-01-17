package Client;

import threadingInventoryManagement.ThreadSafteyWithCollectionsInventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadSafteyWithCollectionsInventoryManager tswcim = new ThreadSafteyWithCollectionsInventoryManager();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				tswcim.populateSoldProductList();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				tswcim.displaySoldProductList();				
			}
		});
		
		t1.start();
		Thread.sleep(2000);
		t2.start();
		
	}
}
