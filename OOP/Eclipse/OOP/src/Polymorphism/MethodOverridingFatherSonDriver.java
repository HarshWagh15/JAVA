package Polymorphism;

public class MethodOverridingFatherSonDriver {
	
	public static void main(String[] args) {
		MethodOverridingFather f1 = new MethodOverridingSon();  // Upcasting
		
		f1.finance();
		f1.name();
	}
}
