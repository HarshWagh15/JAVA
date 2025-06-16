package Abstraction;

public class CalculatorImplimentation extends Calculator{
	public void addition(int num1, int num2) {
		System.out.println(num1+num2);
	};
	
	public void subtraction(int num1, int num2) {
		System.out.println(num1-num2);
	};
	
	
	
	public void multiplication(int num1, int num2) {   //This method will not work because you have not provided this method in main calculator class.
		System.out.println(num1*num2);
	};
	
}
