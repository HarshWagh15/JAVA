class RotateNum{
	public static int rotate(int num){
		int last =num%10;
		num/=10;
		return last*power(10,count(num))+num;
	}

		public static int count(int num){
		int cnt=0;
		while(num>0){
			num/=10;
			cnt++;
		}
		return cnt;
	}
	public static int power(int digit,int cnt){
		int pow=1;
		for(int i=1;i<=cnt;i++){
			pow*=digit;
		}
		return pow;
	}


	public static void main(String[] args) {
		int num=1234;
		System.out.println(rotate(num));
	}
}