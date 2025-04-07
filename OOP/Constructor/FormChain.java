class FormChain{
	String name;
	long phno;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;




FormChain(String name,long phno,char gen, String dob ){
	this.name=name;
	this.phno=phno;
	this.gen=gen;
	this.dob=dob;
}


FormChain(String name,long phno,char gen, String dob, long tel ){
	
	this(name,phno,gen,dob); //Constructor Chaining
	this.tel=tel;
}


FormChain(String name,long phno,char gen, String dob, long tel, String blood ){
	this(name,phno,gen,dob,tel);
	this.blood=blood;
}

public void displayFormChain(){
	System.out.println(name);
	System.out.println(phno);
	System.out.println(tel);
	System.out.println(gen);
	System.out.println(blood);
	System.out.println(email);
	System.out.println(dob);

}
}