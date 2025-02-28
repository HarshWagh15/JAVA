// import java.util.*;
// class BinaryNum{
// 	public static void main(String[] args) {
// 		Scanner SC = new Scanner(System.in);
// 		int num=SC.nextInt();
// 		String binary="";
// 		for(int i=num;i>0;i/=2){
// 			binary=(i%2)+binary;
// 		}
// 		System.out.println(num+":"+binary);
// 	}
// }



import java.util.*;
class BinaryNum{
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int num=SC.nextInt();
		String bin=Integer.toBinaryString(num);
		System.out.println(bin);
	}
}