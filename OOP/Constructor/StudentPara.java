class StudentPara{
	String name;
	int age;
	String college;
	String course;
	int roll;

	StudentPara(String name,int age,String college,String course,int roll){
		this.name=name;
		this.age=age;
		this.college=college;
		this.course=course;
		this.roll=roll;
	}

	public void displayStudentPara(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(college);
		System.out.println(course);
		System.out.println(roll);
	}

}