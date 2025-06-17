package ObjectClass;

public class ToStringStudent {
	String name;
	String college;
	int rollNo;
	String degree;
	String stream;
	
	public ToStringStudent() {
		// TODO Auto-generated constructor stub
	}

	public ToStringStudent(String name, String college, int rollNo, String degree, String stream) {
		super();
		this.name = name;
		this.college = college;
		this.rollNo = rollNo;
		this.degree = degree;
		this.stream = stream;
	}
	
	public String toString() {
		return "Name:"+name+", College:"+ college;
		}
}


	