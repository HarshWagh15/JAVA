class FormDriver{
	public static void main(String[] args) {
		Form f1=new Form("Harsh",123456789,'M',"15/11/03");
		f1.displayForm();

		System.out.println("__________________________");

		Form f2=new Form("Harsh",123456789,'M',"15/11/03",456879);
		f2.displayForm();
	}
}