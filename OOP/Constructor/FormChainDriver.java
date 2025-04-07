class FormChainDriver{
	public static void main(String[] args) {
		FormChain f1=new FormChain("Harsh",123456789,'M',"15/11/03");
		f1.displayFormChain();

		System.out.println("__________________________");

		FormChain f2=new FormChain("Harsh",123456789,'M',"15/11/03",456879);
		f2.displayFormChain();
	}
}