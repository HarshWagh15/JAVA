class DuckNum{
	public static void main(String[] args) {
		String num="012345";
		 boolean isDuck = false;
		for(int i=1;i<num.length();i++){
			if(num.charAt(i)=='0'){
				isDuck=true;
				break;
			}
		}
		if(num.charAt(0)!='0'&& isDuck){
			System.out.println("DuckNum");
		}else{
			System.out.println(" Not a DuckNum");
		}
	}
}