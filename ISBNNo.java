class ISBNNo{
	public static void main(String[] args) {
		long num=1259060977L;
		int sum=0;
		for(long i=num, j=1;i>0;i/=10,j++){
			long rem=num%10;
			sum+=(rem*j);
		}
		if(sum%11==0){
			System.out.println("It is an ISBN No. ");
		}else{
			System.out.println("It is not an ISBN No. ");
		}
	}
}