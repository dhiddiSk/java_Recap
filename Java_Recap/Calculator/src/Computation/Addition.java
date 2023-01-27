package Computation;

import java.util.ArrayList;

public class Addition implements Computation{

	@Override
	public double operation(double operand1, double operand2) {	
		return (operand1 + operand2);
	}
}
