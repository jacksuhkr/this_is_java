package sec08.exam02_abstract_method_override;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat  = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		//변수의 자동 타입 변환
		Animal animal = null;		//new로 새로운 객체를 만들지는 못하니 null로 만듦
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
		public static void animalSound(Animal animal) {
			animal.sound(); 		//매개변수로 Dog를 넣으면 Dog method를, Cat을 넣으면 cat method를!
		}
}
