package Computation;

import java.util.Scanner;

public class PerformCalculation {
	
	public static String operation;
	public static Double operand1;
	public static Double operand2;
	static double operationResult = 0;

	public static void main(String[] args) {
		Scanner inputTheTypeOfOperation = new Scanner(System.in);
		System.out.println("Enter the computation operations \"Add, Subtract, Multiply, Divide\" which you like to perform");
		operation = (inputTheTypeOfOperation.nextLine()).toLowerCase();
		System.out.println("Enter the values");
		System.out.println("Enter first operand ");
		operand1 = inputTheTypeOfOperation.nextDouble();
		System.out.println("Enter the second value ");
		operand2 = inputTheTypeOfOperation.nextDouble();
		
		switch(operation){
		
		case "addition" : Addition add = new Addition();
						  operationResult = add.operation(operand1, operand2);
						  break;
		case "division" : Division div = new Division();
						  operationResult = div.operation(operand1, operand2);
						  break;
		case "multiplication" : Multiplication mul = new Multiplication();
								operationResult = mul.operation(operand1, operand2);
								break;
		case "subtraction" : Subtraction sub = new Subtraction();
							 operationResult = sub.operation(operand1, operand2);
							 break;
			default: System.out.println("Invalid operator");
						break;
		
		}
		inputTheTypeOfOperation.close();
		System.out.println("result is "+operationResult);
	}
}
