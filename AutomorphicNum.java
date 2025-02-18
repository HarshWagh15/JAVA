
class AutomorphicNum{
	public static void main(String[] args) {
		int num=40;
		int div=1;
		int len=0;
		for(int i=num;i>0;i/=10){
			len++;
		}
		for(int i=1;i<=len;i++){
			div*=10;
		}

		System.out.println((num==((num*num)%div))?"Automorphic Number":"Not an Automorphic Number");
	}
}