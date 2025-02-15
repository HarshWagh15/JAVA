// class EY{
// 	public static void main(String[] args) {
// 		String str="0100110111111101";
// 		int Cnt0=0;
// 		int Cnt1=0;
// 		for(int i=0;i<str.length();i++){
// 			char ch=str.charAt(i);
// 			if(ch=='0'){
// 				Cnt0++;
// 			}else if(ch=='1'){
// 				Cnt1++;
// 			}
// 			else{
// 				Cnt0=0;
// 				Cnt1=0;
// 			}
// 		}
				
// 		System.out.println((Cnt0>=7||Cnt1>=7)?"yes":"no");
// 	}
// }


class EY{
	public static void main(String[] args) {
		String str="0100110111111101";
		System.out.println(str);
		boolean check0= str.contains("0000000");
		boolean check1= str.contains("1111111");
		System.out.println(check0||check1?"yes":"no");
	}
}