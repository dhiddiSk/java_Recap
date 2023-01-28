package Threading;

public class Sequence {
	private int sharedValue = 0;
	
	public synchronized int getNext() {
			sharedValue++;
			return sharedValue;
	}
}
