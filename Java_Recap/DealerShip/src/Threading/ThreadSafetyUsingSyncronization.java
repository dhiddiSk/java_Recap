package Threading;

public class ThreadSafetyUsingSyncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Worker();
		w1.start();
		Worker w2 = new Worker();
		w2.start();
	}

}

class Worker extends Thread{
	Sequence sque = new Sequence();
	
	public void run() {
		for(int i=1; i<100; i++) {
			System.out.println(sque.getNext()+ "This the thread from "+ Thread.currentThread().getName());
		}
		System.out.println();
	}
}
