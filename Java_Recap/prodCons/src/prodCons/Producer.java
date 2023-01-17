package prodCons;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> questionList = null;
	final int LIMIT = 5;
	private int questionNo;
	
	
	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	
	public void readQuestion(int questionNo) throws InterruptedException {
		synchronized (questionList) {
			while(questionList.size() == LIMIT) {
				System.out.println("The questions have piled up");
				try {
					questionList.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				questionList.wait();
			}
		}
		
		synchronized (questionList) {
			Thread.sleep(5000);
			System.out.println("Answered question: "+ questionList.remove(0));
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				readQuestion(questionNo++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
