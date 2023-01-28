package Threading;

public class StartingThreadingAndRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world this is first print");
		Task2 t1 = new Task2("from t1");
		t1.start();
		System.out.println("Hello world this is second print");
		Task2 t2 = new Task2("from t2");
		t2.start();
		
	}

}

class Task2 extends Thread{
	
	String str;
	public Task2(String str){
		this.str = str;
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i + " "+str);
		}
	}
	
}
