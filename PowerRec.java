class PowerRec{
	
	public static void main(String[] args) {
		System.out.println(pow(5,2));
	}

	public static int pow(int base,int raise){
		if(raise==0){
			return 1;
		}
		return base*pow(base,raise-1);
	} 
}