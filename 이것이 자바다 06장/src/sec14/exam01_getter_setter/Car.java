package sec14.exam01_getter_setter;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	//Getter 메소드
	public int getSpeed() {
		return speed;
	}
	
	//Setter 메소드
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	//Getter 메소드
	public boolean isStop() {
		return stop;
	}
	//Setter 메소드
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
