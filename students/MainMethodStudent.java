package students;

public class MainMethodStudent {

	public static void main(String[] args) {
		Students obj = new Students();
		
		obj.getStudentInfo(123);
		obj.getStudentInfo(123, "Student name");
		obj.getStudentInfo("abcgmail.com", "123456789");

	}

}
