package Abstraction;

public class CalculatorDriver {

		public static void main(String[] args) {
			
			Calculator c1 = new CalculatorImplimentation();
			
			c1.addition(5, 6);
			c1.subtraction(3, 2);
			c1.division(6, 3);
			
//			c1.multiplication(5,2); // will not work 
		}
}
