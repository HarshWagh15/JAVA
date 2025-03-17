class CoPrime{
	public static void main(String[] args) {
		System.out.println(isCoPrime(3,9));
	}
	
	public static int hcf(int num1,int num2){
		int small=num1<num2?num1:num2;
		while(true){
			if(num1%small==0&&num2%small==0){
				return small;
			}
			small--;
		}
		
	}

	public static boolean isCoPrime( int num1, int num2){
		return hcf(num1,num2)==1;
	}

}