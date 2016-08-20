package sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);	//-50으로 설정하려다 실패하고 속력이 0이됨
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤 
		if(!myCar.isStop()) {	//stop의 default값이 false여서 돌아가기는 하는데 이 if문은 무슨의미인지???
			myCar.setStop(true);	//stop을 true로 바꾸고 스피드를 0으로 바꿈
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
