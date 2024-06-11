package test3;

public class Quest3 {

	public static void main(String[] args) {
		Cat MyCat = new Cat();
		Dog MyDog = new Dog();

		MyCat.Name = "たま";
		MyCat.Age = 3;
		MyDog.Name = "ぽち";
		MyDog.Age = 4;
		MyCat.ShowProfile();
		MyDog.ShowProfile();
		MyCat.Speak();
		MyDog.Speak();
	}

}
