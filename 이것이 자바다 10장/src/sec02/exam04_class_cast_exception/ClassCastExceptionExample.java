package sec02.exam04_class_cast_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		//if(anmal instance of Dog {
			Dog dog = (Dog) animal;			//ClassCastExcemption 발생 가능
		//}
 	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
