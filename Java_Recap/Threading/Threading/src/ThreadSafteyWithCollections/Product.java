package ThreadSafteyWithCollections;

public class Product {
	
	int productId;
	String productName;
	
	 public Product(int productId, String productName) {
		 this.productId = productId;
	 }
	 
	 public void printProduct() {
		 System.out.println("The product with ID "+productId+" with name "+productName);
	 }
	 
	 public static void main(String[] args) throws InterruptedException {
		
		 ThreadSafetyWithCollectionsInventoryManagement tscim1= new ThreadSafetyWithCollectionsInventoryManagement();
		 
		 Thread task1 = new Thread(new Runnable() {
			 public void run() {
				 tscim1.purchasedProductsList();
			 }			 
		 });
		 		 
		 Thread task2 = new Thread(new Runnable() {
			 public void run() {
				 tscim1.soldProductsList();
			 }
		 });
		 
		 task1.start();
		 task2.start();	 
	 }
}
