package sec03.exam01_parent_constructor_call;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("������", "930924-2345678", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}
