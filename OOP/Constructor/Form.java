class Form{
	String name;
	long phno;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;




Form(String name,long phno,char gen, String dob ){
	this.name=name;
	this.phno=phno;
	this.gen=gen;
	this.dob=dob;
}

Form(String name,long phno,char gen, String dob, long tel ){
	this.name=name;
	this.phno=phno;
	this.gen=gen;
	this.dob=dob;

	this.tel=tel;
}

Form(String name,long phno,char gen, String dob, long tel, String blood ){
	this.name=name;
	this.phno=phno;
	this.gen=gen;
	this.dob=dob;
	this.tel=tel;

	this.blood=blood;
}

public void displayForm(){
	System.out.println(name);
	System.out.println(phno);
	System.out.println(tel);
	System.out.println(gen);
	System.out.println(blood);
	System.out.println(email);
	System.out.println(dob);

}
}