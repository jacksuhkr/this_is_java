package sec05.exam02_array_polymorphism;

import sec05.exam01_promotion_polymorphism.*;

public class Car {
	Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() {
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
	}
}
