class Method{
	public static void main(String[] args) {
		System.out.println("Main Start");
		double rupee=100;
		System.out.println("Main End");
		RupeeToDollar(rupee);
	}

	public static void RupeeToDollar(double rupee){
		System.out.println("RTD Start");
		double dollar=rupee/87.15;
		System.out.println(dollar);
		DollarToEuro(dollar);
		System.out.println("RTD End");
	}

		public static void DollarToEuro(double dollar){
		System.out.println("DTE Start");
		double euro=dollar*0.95;
		System.out.println(euro);
		EuroToDirham(euro);
		System.out.println("DTE End");
	}

		public static void EuroToDirham(double euro){
		System.out.println("ETD Start");
		double dirham=euro*3.85;
		System.out.println(dirham);
		System.out.println("ETD End");
	}
}