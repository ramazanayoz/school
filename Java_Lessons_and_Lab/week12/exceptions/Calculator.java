package exceptions;

public class Calculator {

	public int add(int operand1, String operator, int operand2) throws InvalidOperatorException {

		try {
			if (operator.equals("+")) {
				return operand1 + operand2;
			} else if (operator.equals("/")) {
				return operand1 / operand2;
			}

		} catch (ArithmeticException aex) {
			throw new InvalidOperatorException("second operand can  not be zero", aex);
		}
		
		throw new InvalidOperatorException(operator + " is not a valid operator");
	}

}
