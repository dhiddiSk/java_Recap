package prodCons;

import java.util.List;

public class Consumer implements Runnable{

	
	List<Integer> questionList = null;
	
	
	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	
	public void answerQuestions() throws InterruptedException{
		synchronized(questionList) {
			while(questionList.isEmpty()) {
				System.out.println("No Question to Answer... waiting for producer to get questions");
				questionList.wait();
			}
		}
		
		synchronized (questionList) {
			Thread.sleep(5000);
			System.out.println("Answered Questions: "+questionList.remove(0));
			questionList.notify();
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				answerQuestions();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
	}
}
