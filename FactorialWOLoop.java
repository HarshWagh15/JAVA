// class FactorialWOLoop{
// 	public static void main(String[] args) {
// 		System.out.println(Fact(5));
// 	}
// 	public static int Fact(int num){
// 		int fact=1;
// 		for(int i=1;i<=num;i++){
// 			fact*=i;
// 		}
// 		return fact;
// 	}
// }

class FactorialWOLoop{
	public static void main(String[] args) {
		System.out.println(Fact(5));
	}
	public static int Fact(int num){
		if(num==0){
			return 1;
		}
		return num*Fact(num-1);
	}
}