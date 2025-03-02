class RangeOfArmstrong{
	public static boolean isArmstrong(int num){
		int sum=0;
		int originalNum=num;
		for(int i=num;i>0;i/=10){
			sum+=power(i%10,count(num));
		}
			return originalNum==sum;
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
		for(int i=1;i<=1000;i++){
			if(isArmstrong(i))
				System.out.println(i);
		}
	}
}