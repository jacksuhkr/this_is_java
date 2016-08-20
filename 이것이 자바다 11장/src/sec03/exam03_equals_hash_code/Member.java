package sec03.exam03_equals_hash_code;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {					//�Ű����� member�������� Ȯ��
			Member member = (Member) obj;			//Member Ÿ������ ���� Ÿ�� ��ȯ�ϰ�
			if(id.equals(member.id)) {				//id �ʵ尪�� �������� �˻�����
				return true;			 			//�����ϴٸ� true ����
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
