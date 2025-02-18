// 1
// 2 7
// 3 6 8
// 4 5 9 10


class Pattern7{
	public static void main(String[] args) {
		int evenDiff=7, oddDiff=-2;
		int n=4;
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
			int temp=i;
			for(int j=2;j<=i;j++){
				if(j%2==0){
					temp+=evenDiff;
					System.out.print(temp+" ");
				}else{
					temp+=oddDiff;
					System.out.print(temp+" ");
				}
			}
					System.out.println();
				evenDiff-=2;
				oddDiff+=2;
				}
				
	}
}