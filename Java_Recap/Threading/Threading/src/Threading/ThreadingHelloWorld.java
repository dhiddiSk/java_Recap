package Threading;

public class ThreadingHelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Task ts = new Task();	
		Task ts2 = new Task();
		ts2.start();
		System.out.println("Hello world, this is threading");
		ts.start();
	}
}

class Task extends Thread{
		public void run() {
			// Print the numbers from 1 till 1000
			for(int i=0; i<100; i++) {
				System.out.println(i);
			}
		}
}
