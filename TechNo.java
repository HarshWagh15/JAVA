class TechNo{
	public static void main(String[] args) {
		int num=2025 , len=0 , div=1;
		for(int i=num;i>0;i/=10)
			len++;

		if(len%2==0){
			for(int i=1;i<=(len/2);i++){
				div*=10;
			}

				int sum=(num%div)+(num/div);
				int sqr=sum*sum;
			
				System.out.println(sqr==num?"It is Tech No.":"It is not an tech no.");
		}else{
			System.out.println("Tech No is not possible.");
		}

		

	}
}