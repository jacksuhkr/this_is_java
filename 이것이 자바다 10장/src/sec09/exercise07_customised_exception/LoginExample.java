package sec09.exercise07_customised_exception;

public class LoginExample {
	 public static void main(String[] args) {
		 try {
			 login("white", "12345");
		 } catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 
		 try {
			 login("blue", "54321");
		 } catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		 //id�� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
		 if(!id.equals("blue")) {
			 //�ۼ� ��ġ
			 throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		 }
		 
		 //password�� "12345"�� �ƴ϶�� WrongPasswordException �߻���Ŵ
		 if(!password.equals("12345")) {
			 //�ۼ� ��ġ
			 throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		 }
	 }
}
