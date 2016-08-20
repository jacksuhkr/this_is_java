package sec08.exam02_abstract_method_override;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat  = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;		//new�� ���ο� ��ü�� �������� ���ϴ� null�� ����
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		//�޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
		public static void animalSound(Animal animal) {
			animal.sound(); 		//�Ű������� Dog�� ������ Dog method��, Cat�� ������ cat method��!
		}
}
