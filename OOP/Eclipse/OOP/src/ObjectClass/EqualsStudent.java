package ObjectClass;

public class EqualsStudent {
	String name;
	String college;
	int rollNo;
	String degree;
	String stream;
	
	public EqualsStudent() {
		// TODO Auto-generated constructor stub
	}

	public EqualsStudent(String name, String college, int rollNo, String degree, String stream) {
		super();
		this.name = name;
		this.college = college;
		this.rollNo = rollNo;
		this.degree = degree;
		this.stream = stream;
	}
	
	public boolean equals(Object o) {
		EqualsStudent e1 = (EqualsStudent)o; /// Downcasting is done here, because generalization & upcasting is there in the form of "o"
		
		if(this.name==e1.name && this.college==e1.college) {
			return true;
		}
		return false;
	}
	
}
