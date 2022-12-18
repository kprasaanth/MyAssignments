package students;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("ID:"+ id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("ID:"+id+" and Name:"+name);
	}
	
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Email:"+email+" and PhoneNumber:"+phoneNumber);
	}
	

}
