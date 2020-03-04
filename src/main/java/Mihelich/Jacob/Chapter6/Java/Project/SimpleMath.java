package Mihelich.Jacob.Chapter6.Java.Project;

public class SimpleMath {

//IS THIS RIGHT? jk obviously not
//create a method that accepts two double parameters and returns a double value
	public double divide(double numerator, double denominator) {
		if(denominator ==0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		double result;
		result = numerator/denominator;
		
		return result;
	}
	
	//create multiply method
	public double multiply(double number1, double number2) {
		double result;
		result = number1*number2;
		return result;
	}
	
}
