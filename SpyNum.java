class SpyNum{
	public static void main(String[] args) {
		int num=1124;
		int sum=0;
		int product=1;
		for(int i=num;i>0;i/=10){
			int rem=i%10;
			sum+=rem;
			product*=rem;
		}
		System.out.println((sum==product)?("Spy Number"):("Not an Spy Number"));
	}
}