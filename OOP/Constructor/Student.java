class Student{
	String name;
	int age;
	String college;
	String degree;
	int roll;

	Student()  //Constructor 
	{
		System.out.println("From no Args Constuctor");
		System.out.println(this);
	}

	public void displayStudent(){
		String name="Mighty Raju";
		System.out.println("Local Name: "+name);
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+age);
		System.out.println("College: "+college);
		System.out.println("Degree: "+degree);
		System.out.println("Roll No: "+roll);

	}
}

