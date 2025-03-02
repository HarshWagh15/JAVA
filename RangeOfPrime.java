class RangeOfPrime{

	public static boolean IsPrime(int num){
		int cnt=0;
		for(int i=2;i<num;i++){
			if(num%i==0)
				cnt++;	
		}
		if(cnt==0)
				return true;
		return false;
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){
			if(IsPrime(i))
			System.out.println(i);
		}
	}
}