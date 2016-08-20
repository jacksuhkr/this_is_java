package sec07.exam04_polymorphism_array;

public class Tire {
	//필드
	public int maxRotation;				//최대 회전수(타이어 수명)
	public int accumulatedRotation;		//누적 회전수
	public String location;				//타이어의 위치
	public String model;				//내가 추가함, 모델명
	
	//생성자
	public Tire(String location, int maxRotation, String model) {
		this.location = location;
		this.maxRotation = maxRotation;
		this.model = model;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;		//누적 회전수 1증가
		if(accumulatedRotation<maxRotation) {			//정상 회전 (누적<수명)일 경우 실행
			System.out.println(location + " " + model + "Tire 수명: " + 
				(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + model + "Tire 펑크 ***");
			return false;
		}
	}
	//뒤쪽 타이어는 펑크가 나도 그 회차에 앞쪽이 펑크나면 일단 달림 ㅋ 수명보다 1바퀴 더달림
}
