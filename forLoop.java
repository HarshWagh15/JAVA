class forLoop
{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			System.out.print(i);
		}
		System.out.println();


		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch);
		}
		System.out.println();

		for(char ch='z';ch>='a';ch--){
			System.out.print(ch);
		}
		System.out.println();

		for(char i='0';i<='9';i++){
			System.out.print(i);
		}
		System.out.println();


		for(int i=1;i<=127;i++){
			System.out.print(i + ":"+(char) i+" ");
		}
		
		
	}
}