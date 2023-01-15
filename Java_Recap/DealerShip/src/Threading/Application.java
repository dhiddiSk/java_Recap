package Threading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hey this is concept of Threading-a");
		Task t1 = new Task("thread-a");
		Thread thread1 = new Thread(t1);
		thread1.start();
		System.out.println("Hey this is concept of Thereading-b");
		Task t2 = new Task("thread-b");
		Thread thread2 = new Thread(t2);
		thread2.start();
	}
}

class Task implements Runnable {
	
	String name;
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(name);
		for(int i=0; i< 1000; i++) {
			System.out.println("number: "+i+" - "+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}