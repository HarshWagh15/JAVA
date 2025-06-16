package Abstraction;

public abstract class Calculator {
	public abstract void addition(int num1, int num2);
	
	public abstract void subtraction(int num1, int num2);
	
	public void division(int num1, int num2) {
		System.out.println(num1/num2);
	}
}
