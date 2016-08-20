package sec07.exam03_polymorphism;

public class HankookTire extends Tire {
	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {			
			System.out.println(location + " HankookTire 수명: " + 		//Tire -> HankookTire로
				(maxRotation-accumulatedRotation) + "회");				//프린트 내용만 바뀜
			return true;
		} else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
		//그냥 프린트 함수면 따로 두고 그 부분만 override하게끔 하면 어땟을까
	}
}
