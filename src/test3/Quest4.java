package test3;

public class Quest4 {

	public static void main(String[] args) {
		Animal[] MyPets = new Animal[4];

		MyPets[0] = new Cat();
		MyPets[1] = new Dog();
		MyPets[2] = new Cat();
		MyPets[3] = new Dog();

		for (Animal Pet : MyPets)
			Pet.Speak();
	}

}
