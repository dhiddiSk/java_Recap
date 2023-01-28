package Threading;

public class ThreadSafetyUsingSynchronization {

	public static void main(String[] args) {
		Sequence sq = new Sequence();
		System.out.println("Printing the values when called from first thread");
		Taskk tk1 = new Taskk("thread1", sq);
		tk1.start();
		System.out.println("Printing the vales when called from second thread");
		Taskk tk2 = new Taskk("thread2", sq);
		tk2.start();
	}

}

/*
 * Single Thread: Here, the single thread is running normally and tries to access one single value at one time.
 * Multithread: Here, multiple threads are running in parallel to access the value. 
 * So, my assumption is that each thread will be able to access the value ones it get's updated.
 */

class Taskk extends Thread{
	String thread;
	Sequence sq = null;
	public Taskk(String string, Sequence sq) {
		this.thread = string;
		this.sq = sq;
	}

	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(sq.getNext() +  this.thread+ " got value");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}