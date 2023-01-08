package test;

public class MyUtils {

	public static void printSomeJunk(String args) {
		// TODO Auto-generated method stub
		System.out.println("This is the junk that's printed with strings "+args);
	}
	
	public static void printSomeJunk(int args) {
		System.out.println("This is the junk that's printed with integers "+args);
	}

	public static int add20(int add20) {
		int result = add20 + 30;
		return result;
	}
}
