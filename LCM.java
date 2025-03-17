class LCM{
	public static void main(String[] args) {
		System.out.println(lcm(2,3));
	}
	public static int lcm(int num1,int num2){
		int max=num1>num2?num1:num2;
		int i=1;
		while(true){
			if((max*i)%num1==0 && (max*i)%num2==0){
				return max*i;
			}
			i++;
		}
	}
}