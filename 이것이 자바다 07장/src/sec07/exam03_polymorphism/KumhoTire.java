package sec07.exam03_polymorphism;

public class KumhoTire extends Tire {
	//필드
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {			
			System.out.println(location + " KumhoTire 수명: " + 		//Tire -> HankookTire로
				(maxRotation-accumulatedRotation) + "회");				//프린트 내용만 바뀜
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
