package ObjectClass;

public class EqualsStudentDriver {
	public static void main(String[] args) {
		EqualsStudent s1 = new EqualsStudent("Ha","SIT0",123,"BE","CS");
		EqualsStudent s2 = new EqualsStudent("Ha","SIT0",123,"BE","CS");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toString()); //both will give reference id of the object;
		
		System.out.println(s1==s2);  // comparing reference id's of the object
		System.out.println(s1.equals(s2)); // Comparing attributes of the object 
	}
}
