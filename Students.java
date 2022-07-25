package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID : " +id);
	}

	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID : " +id);
		System.out.println("Student Name : " +name);

	}

	public void getStudentInfo(String email , long phoneNum) {
		System.out.println("Student email : " +email);
		System.out.println("Student Phone Number : " +phoneNum );

	}

	public static void main(String[] args) {

		//examples of method overloading

		Students details = new Students();
		details.getStudentInfo(15786);
		details.getStudentInfo(157893, "Indhu");
		details.getStudentInfo("drg@gmail.com",1125479269L);
	}

}
