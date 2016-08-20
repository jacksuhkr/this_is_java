package sec14.exam01_getter_setter;

public class Car {
	//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	
	//�޼ҵ�
	//Getter �޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	//Setter �޼ҵ�
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	//Getter �޼ҵ�
	public boolean isStop() {
		return stop;
	}
	//Setter �޼ҵ�
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
