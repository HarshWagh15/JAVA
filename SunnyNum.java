class SunnyNum{
	public static void main(String[] args) {
		int num=81;
		int checkNum=num+1;
			boolean flag=false;
		for(int i=1;i<=checkNum;i++){
			if(i*i==checkNum){
				flag=true;
				System.out.println("It is Sunny Number ");
			}
			if(i*i>checkNum)
				break;
		}
		if(!flag)
			System.out.println("It is Not a Sunny Number.");
	}
}