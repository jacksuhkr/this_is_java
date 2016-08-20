package sec03.exam01_equals;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {					//매개값이 member하입인지 확인
			Member member = (Member) obj;			//Member 타입으로 강제 타입 변환하고
			if(id.equals(member.id)) {				//id 필드값이 동일한지 검사한후
				return true;			 			//동일하다면 true 리턴
			}
		}
		return false;
	}
}
