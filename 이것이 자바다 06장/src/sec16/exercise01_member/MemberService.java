package sec16.exercise01_member;

public class MemberService {
	//작성 위치
	String id = "hong";
	String password = "12345";
	
	boolean login(String id, String password) {
		if(this.id.equals(id) & this.password.equals(password)) return true;
		else return false;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
