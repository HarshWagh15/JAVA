class FascinatingNum{
	public static void main(String[] args) {
		int num=327;
		String str=num+""+(num*2)+(num*3);
		boolean flag=true;
		for(char i='i';i<='9';i++){
			int cnt=0;
			for(int j=0;j<str.length();i++){
				char ch= str.charAt(j);
				if(ch==i)
					cnt++;
			}
			if(cnt!=1){
				flag=false;
				break;
			}


		}
	if(flag){
		System.out.println(num+" is Fascinating.");
	}else{
		System.out.println(num+" is not Fascinating.");
	}
	}
}