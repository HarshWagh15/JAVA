// 1 8 9  16
// 2 7 10 15
// 3 6 11 14
// 4 5 12 13

class Pattern6{
	public static void main(String[] args) {
		int evenDiff=7, oddDiff=1;
		int n=4;
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
			int temp=i;
			for(int j=2;j<=n;j++){
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

